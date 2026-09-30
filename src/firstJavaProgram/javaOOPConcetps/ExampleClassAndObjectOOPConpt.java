package firstJavaProgram.javaOOPConcetps;

class Student {
	
	String name; 
	int age; 
	
	void display() {
		System.out.println(name);
		System.out.println(age);

	}
}

class ExampleEncapsulation{
	
	private double balance; 
	
	// setter method:
	public void deposit(double amount) {
		 
		if(amount > 0) {
			balance += amount;  
		}else {
			System.out.println("Invalid amount...");
		}
	}
	 
	// getter method: 
	public double getBalance () {
		return balance; 
	}
}

public class ExampleClassAndObjectOOPConpt {
         
      public static void main(String[] args) {
    	  
    	  Student st = new Student();
    	  
    	  st.name = "Anuj";
    	  st.age = 22; 
    	  
    	  st.display();
    	  
    	  
    	  ExampleEncapsulation Es = new ExampleEncapsulation();
    	  
    	  Es.deposit(5000);
    	  Es.deposit(4000);
    	  
    	  System.out.println(Es.getBalance());
    	  
      }
		
}
