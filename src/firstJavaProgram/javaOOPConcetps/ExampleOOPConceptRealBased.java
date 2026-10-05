package firstJavaProgram.javaOOPConcetps;

abstract class Employees{
	
	// Encapculation:
    private String name;
    private double salary;
    
    // Constructors:   
    public Employees(String name, double salary) {
    	this.name = name;
    	this.salary = salary;
    }
     
    // Getter
     public String getName() {
    	 return name;
     }
     public double getSalary() {
    	 return salary;
     }
     
     // Abstraction: 
      abstract void work();
      
     // Concrete Method    
      void displayEmpDetails() {
    	  System.out.println("Name : "+ name);
    	  System.out.println("Salary : "+ salary);
      }
}

class DevMembers extends Employees{

	public DevMembers(String name, double salary) {
		super(name, salary);
	}
	
	@Override
	void work() {
		System.out.println("Developer writes Java code");
	}
}

class QAMembers extends Employees{

	public QAMembers(String name, double salary) {
		super(name, salary);
	}
	
	void work() {
		System.out.println("tester test the application");
	}
	
}

public class ExampleOOPConceptRealBased {

	public static void main(String[] args) {

		// Runtime Polymorphism :
		
		Employees emp1 = new DevMembers("Guru charan", 50000);
		Employees emp2 = new QAMembers("Seema singh", 45000);
		
		emp1.work();
		emp1.displayEmpDetails();
		System.out.println("*******************************************");
		emp2.work();
		emp2.displayEmpDetails();


	}

}
