package firstJavaProgram;


public class HelloWorld {
	 
	 String name; 
	 
	 void display() {
		 System.out.println("Student: "+ name);
	 }
	 // Instance Scope: 
	 {
	    System.out.println("Instance Result...");  // It needs Object reference of Class. 	 
	 }
	 // Static Scope:
	 static {
		 System.out.println("Static Result..."); // Just Run at class load time. 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the First Java Program...!");
		
		HelloWorld hw = new HelloWorld();
//		 hw.name = "Rahul";
//		 hw.display();

	}

}
