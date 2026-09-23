package firstJavaProgram;
//import java.util.Scanner;

class Test{
	 
	void calculation() {
		 //int res = 10/0; // infinity result issues
		int num = 10; 
		int res = num/2;
		 System.out.println(res);
		 System.out.println(num);

	}
	
}


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
		Test ts = new Test();
//		Scanner sc = new Scanner(System.in);
		
		
		 hw.name = "Rahul";
		 hw.display();
		 ts.calculation();
		

	}

}
