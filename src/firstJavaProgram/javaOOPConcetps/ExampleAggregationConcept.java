package firstJavaProgram.javaOOPConcetps;

class College{
	
	String name; 
	
	College(String name){
		this.name  = name; 	
	}
}
class Faculty{
	
	College clg;     // tight coupling
	
	Faculty(College clg){
		this.clg= clg;
		
	}

	void show () {
		System.out.println("College Name : " + this.clg.name);
	}
	
}
public class ExampleAggregationConcept {
	
	public static void main(String[] args) {
		College clgName = new College("Arnu Institution of Engg & Technoloy, Pune");
		Faculty fc = new Faculty(clgName);
		fc.show();
		System.out.println("College Name : " + fc.clg.name);
	}

}
