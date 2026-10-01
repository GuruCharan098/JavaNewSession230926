package firstJavaProgram.javaOOPConcetps;

class StudentData{
	
	String name; 
	int age; 
	
	StudentData(){
		name="Unknown";
		age= 0;
	}
	
	StudentData(String name){
		this.name = name; 
	}
	
	StudentData(String name, int age){	
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Student name :"+ this.name);
		System.out.println("Student age :"+ this.age);
	}
}


class EmployeeMember{
	
	String name = "Employee";
	
	void display() {
		System.out.println("Employee display...");
	}
}

class DeveloperMember extends EmployeeMember{
	
	String name = "Developer";
	
	void show() {
		System.out.println(name);
		System.out.println(super.name);
		super.display();
		
	}
}
public class ExampleConstructorConcept {
	
	public static void main(String[] args) {
		StudentData sd = new StudentData();
		StudentData sd1 = new StudentData("Rahul", 26);
		StudentData sd2 = new StudentData("Seema");
        
		//sd1.display();
		//sd2.display();
		 sd.display();
		
		 
		 DeveloperMember Dm = new DeveloperMember();
		 Dm.show();
	}

}
