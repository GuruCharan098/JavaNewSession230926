package firstJavaProgram.multipleThreadProgramming;

// Runnable Interface: 
class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println(
				"Task is running in: "
		         +Thread.currentThread().getName());
	}
	
}

// Thread Class : 
class MyThread extends Thread{
	
	  @Override
	  public void run() {
		    System.out.println("Thread is Running");
		    System.out.println(Thread.currentThread().getPriority());
		    System.out.println(Thread.currentThread().getName());
		  //Thread task....
	  }
}


// Multiple Threads by Runnable and sleep method. 

   class MyExampleThread implements Runnable{
	   
	   @Override
	     public void run() {
		   
		   for(int i=1; i<=5; i++) {
			   System.out.println(Thread.currentThread().getName()+ ":"+ i);
			   
			   try {
				   Thread.sleep(1000);
			   }catch(InterruptedException e) {
				   Thread.currentThread().interrupt();
			   }
		   }
	   }
   }
   
  // Join(): 
   
    class OrganisationTask extends Thread{
    	 
    	@Override
    	
    	public void run() {
    		
    		for(int j = 1; j<=3; j++) {
    			
    			System.out.println(j);
    			
    			try {
    				Thread.sleep(500);
    			}catch(InterruptedException e) {
    				Thread.currentThread().interrupt();
    			}
    		}
    	}
    }

public class ExamplesJavaThreadConcepts {

	   public static void main(String[] args) throws InterruptedException {
		   
		   
//		   Thread  t1 = new Thread(
//				   new MyExampleThread(),"Thread-A");
//		   
//		   Thread  t2 = new Thread(
//				   new MyExampleThread(),"Thread-B");
//		   
//		   
//		   t1.start();
//		   t2.start();
		   
		   
		   
		   OrganisationTask Ot1 = new OrganisationTask();
		   
		   Ot1.start();
		   Ot1.join();
		   
		   System.out.println("Main Thread Continues....");
		   
		   
		   
		   
		   
//		   MyTask process2 = new MyTask();
//		   Thread task1 = new Thread(process2);
//		   
//		 //  task1.start();
//		   System.out.println("__________________");
//
//		   
//		   MyThread process1 = new MyThread();
		   
		   //process1.start();
	   }
}
