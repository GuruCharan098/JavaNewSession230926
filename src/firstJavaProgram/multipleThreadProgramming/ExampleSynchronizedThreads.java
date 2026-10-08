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

   
 // Wait(), Notify() and NotifyAll(): 
    class SharedData{
    	
    	private int value;
    	private boolean available = false; 
    	
    	synchronized void produce(int value) {
    		
    		while(available) {
    			try {
    				wait();
    			}catch(InterruptedException e) {
    				Thread.currentThread().interrupt();
    			}
    		}
    		
    		this.value = value; 
    		available = true;
    		
    		System.out.println("Produced :" + value);
    		notify();
    	}
    	
    	synchronized int consume() {
    		while(!available) {
    			try {
    				wait();
    				
    			}catch(InterruptedException e) {
    				Thread.currentThread().interrupt();
    			}
    		}
    		int result = value; 
    		available = false; 
    		
    		System.out.println("Consume :" + result);
    		
    		notify();
    		
    		return result; 

    	}
    }
  
 
     
       
    
public class ExampleSynchronizedThreads {

	 public static void main(String[] args) throws InterruptedException {
		 
		 
//		 SharedData sd = new SharedData();
//		 
//		 Thread producer = new Thread(()->{
//			 
//			 for(int i=1; i<=5; i++) {
//				 sd.produce(i);
//			 }
//		 });
//		 
//		 
//         Thread consume = new Thread(()->{
//			 
//			 for(int i=1; i<=5; i++) {
//				 sd.consume();
//			 }
//		 });
//		 
//         producer.start();
//         consume.start();
//		 
//		 
//		 
//		 CounterOperations co = new CounterOperations();
//		 
//		 Thread T1 = new Thread(new CounterTask(co));
//		 Thread T2 = new Thread(new CounterTask(co));
//
//		 T1.start();
//		 T2.start();
//		 
//		 T1.join();
//		 T2.join();
//		 
//		 
//		 System.out.println("Final Count : "+ co.getCount());
//		 
//		 
//		 //
//		 Resources r1 = new Resources("Data 1");
//		 Resources r2 = new Resources("Data 2");
//		 
//		 Thread t1 = new Thread(()->{
//			 
//			synchronized (r1) {
//			    System.out.println("Thread 1 locked by Data 1");
//			    
//			    try {
//			    	Thread.sleep(100);
//			    }catch(InterruptedException e) {
//			    	Thread.currentThread().interrupt();
//			    }
//			    
//			    synchronized (r2) {
//				    System.out.println("Thread 1 locked and waits for Data 2");
//
//				 }
//			 }
//		
//		 });
//		 
//		 Thread t2 = new Thread(()->{
//				
//				synchronized (r2) {
//				    System.out.println("Thread 2 locked by Data 2");
//				    
//				    try {
//				    	Thread.sleep(100);
//				    }catch(InterruptedException e) {
//				    	Thread.currentThread().interrupt();
//				    }
//				    
//				    synchronized (r1) {
//					    System.out.println("Thread 2 locked and waits for Data 1");
//
//					 }
//				 }
//				
//		 });
//		 
//		 t1.start();
//		 t2.start();
		 
		 
		 // Daemon Threads: 	 
		 Thread daemon = new Thread(()->{
			 
			 while(true) {
				 System.out.println("Backgroud Task...");
				 
				 try {
					 
					 Thread.sleep(1000);
				 }catch(InterruptedException e) {
					 Thread.currentThread().interrupt();
					 break;
				 }
			 }
		 });
		
		 daemon.setDaemon(true);
		 daemon.setName("Employee-Thread");
		 daemon.start();
		 System.out.println(daemon.isAlive());
		 System.out.println(daemon.getName());

	 }
	 
	 
}
