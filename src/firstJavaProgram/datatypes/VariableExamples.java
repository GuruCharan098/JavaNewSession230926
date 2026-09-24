package firstJavaProgram.datatypes;

public class VariableExamples {
	
	
	static String collage = "ABC collage"; 
	       String name ; 
	       
	// Instance variable
	 int x = 20;
	 int y = 5;
	 
	 {
		 //System.out.println(x/y);
	 }
	
	  void display() {
		  // local variable
		  int a = 10;
		  int b = 20;
		  
		 // System.out.println(a+b);
	  }
	  
	  

	public static void main(String[] args) {
		
		VariableExamples ve = new VariableExamples();
		VariableExamples ve1 = new VariableExamples();
		 ve1.name ="Raman";
		 ve.name = "Anuj arya";
		 
		 
		 System.out.println(ve1.name);
		 System.out.println(ve1.collage);
		 
		 System.out.println(ve.collage);
		 System.out.println(ve.name);
		 
		 
		 
		 final double PI = 3.14159;
		 double radious = 5; 
		 
		 double area = PI * radious * radious;
		 
		 System.out.println("****************************************");
		 System.out.println(area);

		 
		 // Widening Type Casting: 
		    int a = 100; 
		    double val = a;
			 System.out.println("****************************************");
			 System.out.println(val);
			 
			 
		// Narrowing Type Casting: 
			 double price = 245.78; 
             int value = (int) price;
			 System.out.println("****************************************");
             System.out.println(value);
             
             
         // Output printf(): 
             String Student_Name = "Guru charan";
             int age = 26; 
             double salary = 66888.323;
			 System.out.println("****************************************");
             System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", Student_Name, age, salary);
		
		ve.display();
	}

}
