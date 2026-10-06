package firstJavaProgram.modifierKeywords;

// public :
class ExampleUser{
	 
	private String name = "Rahul";
	
	public void display() {
		System.out.println(name);
	}
}
// Private :
class BankAccount{
	
	private double existAmount = 5000; 
	
	public void showBalance() {
		System.out.println(existAmount);
	}
	
	
}
// Protected: 
class HospitalStuff{
	
	protected String doctorName = "Mr Avinash Kumar (MBBS)";
	
	protected void stauffMemeber() {
		System.out.println("Welcome to The Hospital....");
	}
}

class NursingStuff extends HospitalStuff{
	
	void display() {
		System.out.println(doctorName);
		stauffMemeber();
	}
	
}
// Default:
class Member {
	
	String name = "Reena kumari";
	
	void showName() {
		System.out.println(name);
	}
}

// static:
        // variable and method example

class StaticExample{
	
	int rollNo;
	String name; 
	
	static String college = "AVP College, India";
	
	static int add(int a, int b) {
		return a+b;
	}
	
	StaticExample(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
}

 // Synchronized Modifier: 
   class Counter {
	    
	    private int count = 0; 
	    
	    synchronized void increment() {
	    	count++; 
	    }
	    
	    int getCount() {
	    	return count; 
	    }
   }
   
   // counter.increment
   
   
   // Volatile Modifer: 
   
   class Worker{
	   
	   private volatile boolean running = true; 
	   
	   void stop() {
		   running = false; 
	   }
	   
	   void work() {
		   
		     while(running) {
		    	 System.out.println("Working....!");
		    	 
		    	 try {
		    		 Thread.sleep(500);
		    	 }catch(InterruptedException e) {
		    		 e.printStackTrace();
		    	 }
		    	 
		    	// System.out.println("Stopped...!");
		     }
	   }
	   
   }
   
   // Native Modifier: 
   
     class Calculation {
    	 
    	 public native int add(int a, int b);
    	 
    	 static {
    		 
    		 System.loadLibrary("Calculation");
    	 }
     }
    
 
public class ExamplesOfModifiersConcept {

	public static void main(String[] args) {
		
		Calculation cl = new Calculation();
		
		int res = cl.add(10, 11);
		
		System.out.println(res);

//		ExampleUser exu = new ExampleUser();
//		exu.display();
//		// System.out.println(exu.name);
//		
//		BankAccount acc = new BankAccount();
//	    acc.showBalance();
////       System.out.println(acc.existAmount);
//	    
//	    NursingStuff Ns = new NursingStuff();
//	    Ns.display();
//	    
//	    Member user = new Member();
//	    user.showName();
//	    
	    StaticExample s1 = new StaticExample(101, "Raama Tiwari");
	    StaticExample s2 = new StaticExample(102, "Avinabh Singh");
	    
	    int result = StaticExample.add(6, 4);
	    System.out.println("Addition : " + result);
	    
	    Counter c = new Counter();
	    
	    c.increment();
	    System.out.println(c.getCount());
	    
	    
	    
	    Worker worker = new Worker();
	    
	    Thread workerThread = new Thread(() -> {
	    	  worker.work();
	    });
	    
	    workerThread.start();
	    
	    
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    
	    System.out.println("Main thread: Stopping worker.....!");
	    worker.stop();
	    
	    //P1.

//	  System.out.println(s1.college);
//	  System.out.println(s1.name);
//	  System.out.println(s1.rollNo);
//
//
//	  System.out.println(s2.college);
//	  System.out.println(s2.name);
//	  System.out.println(s2.rollNo);

	    
	    
	}

}
