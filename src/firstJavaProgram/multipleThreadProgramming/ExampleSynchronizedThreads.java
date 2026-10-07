package firstJavaProgram.multipleThreadProgramming;

class CounterOperations{
	
	  private int count = 0;
	  // Method: 
	  synchronized void increment() {
		  count++;
	  }
	  // Block 
//	  void increment() {
//		   synchronized (this) {
//		         count++;
//		   }
//	  }
	  
	  int getCount() {
		  return count;
	  }
}

class CounterTask implements Runnable{
	
	private CounterOperations counter;
	
	CounterTask(CounterOperations counter){
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			counter.increment();
		}
	}
}

// Deadlock 

   class Resources{
	   
	   String name;
	   
	   Resources(String name){
		   this.name = name;
	   }
   }

public class ExampleSynchronizedThreads {

	 public static void main(String[] args) throws InterruptedException {
		 
		 CounterOperations co = new CounterOperations();
		 
		 Thread T1 = new Thread(new CounterTask(co));
		 Thread T2 = new Thread(new CounterTask(co));

		 T1.start();
		 T2.start();
		 
		 T1.join();
		 T2.join();
		 
		 
		 System.out.println("Final Count : "+ co.getCount());
		 
		 
		 //
		 Resources r1 = new Resources("Data 1");
		 Resources r2 = new Resources("Data 2");
		 
		 Thread t1 = new Thread(()->{
			 
			synchronized (r1) {
			    System.out.println("Thread 1 locked by Data 1");
			    
			    try {
			    	Thread.sleep(100);
			    }catch(InterruptedException e) {
			    	Thread.currentThread().interrupt();
			    }
			    
			    synchronized (r2) {
				    System.out.println("Thread 1 locked and waits for Data 2");

				 }
			 }
		
		 });
		 
		 Thread t2 = new Thread(()->{
				
				synchronized (r2) {
				    System.out.println("Thread 2 locked by Data 2");
				    
				    try {
				    	Thread.sleep(100);
				    }catch(InterruptedException e) {
				    	Thread.currentThread().interrupt();
				    }
				    
				    synchronized (r1) {
					    System.out.println("Thread 2 locked and waits for Data 1");

					 }
				 }
				
		 });
		 
		 t1.start();
		 t2.start();
	 }
}
