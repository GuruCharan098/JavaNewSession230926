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

class StaticExample{
	
	int rollNo;
	String name; 
	
	static String college = "AVP College, India";
	
	StaticExample(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
}
 
public class ExamplesOfModifiersConcept {

	public static void main(String[] args) {

		ExampleUser exu = new ExampleUser();
		exu.display();
		// System.out.println(exu.name);
		
		BankAccount acc = new BankAccount();
	    acc.showBalance();
//       System.out.println(acc.existAmount);
	    
	    NursingStuff Ns = new NursingStuff();
	    Ns.display();
	    
	    Member user = new Member();
	    user.showName();
	    
	    StaticExample s1 = new StaticExample(101, "Raama Tiwari");
	    StaticExample s2 = new StaticExample(102, "Avinabh Singh");

	  System.out.println(s1.college);
	  System.out.println(s1.name);
	  System.out.println(s1.rollNo);


	  System.out.println(s2.college);
	  System.out.println(s2.name);
	  System.out.println(s2.rollNo);

	    
	    
	}

}
