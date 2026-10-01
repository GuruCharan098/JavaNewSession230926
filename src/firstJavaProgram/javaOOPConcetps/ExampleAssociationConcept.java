package firstJavaProgram.javaOOPConcetps;


class Students{
	
	String name;
	
	Students(String name){
		 this.name = name; 
	 }
	
	 void study() {
		 System.out.println(this.name + " is studying.");
	 }
}

class Teacher{
	 String name;
	 
	 Teacher(String name){
		 this.name = name; 
	 }
	 
	 void teach(Students std) {   // here std object behaves like tight coupled object. 
		 System.out.println(this.name + " is teaching." + std.name);
		 std.study();
	 }
}


public class ExampleAssociationConcept {
  
	public static void main(String[] args) {
		
		Teacher t = new Teacher("Guru charan");
		Students s = new Students("Rahul");
		
		t.teach(s);
		//s.study();
	}
}
