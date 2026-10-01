package firstJavaProgram.javaOOPConcetps;

class Employee{
	
	String name; 
	
	void work() {
		System.out.println("Employee is working...");
	}
}

class Developers extends Employee {
	
	void writeCode() {
		System.out.println("Developer writes code...");
		
	}
}

// Multiple Inheritance with Interfaces: 
   interface A{
	   void methodA();
   }
   
   interface B{
	   void methodB();
   }
   
   class C implements A, B{
	   
	   public void methodA() {
           System.out.println("Interface of A"); 
	   }
	   
	   public void methodB() {
           System.out.println("Interface of B"); 
	   }
   }


public class ExampleInheritanceConcept {
	
	 public static void main(String[] args) {
		 
		 Developers dev = new Developers();
		 
		 dev.name = "Reena Gupta"; 
		 dev.work();
		 dev.writeCode();
		 
		 
		 C  obj = new C(); 
		 obj.methodA();
		 obj.methodB();
	 }

}
