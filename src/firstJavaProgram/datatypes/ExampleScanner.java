package firstJavaProgram.datatypes;
import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		 String name = sc.next();
		 System.out.println("****************************************");

		System.out.println("Enter your age:");
		 int age = sc.nextInt();
		 
		 System.out.println("****************************************");

		 
		System.out.println("Enter your salary:");
		 
		  double salary = sc.nextDouble();
			 System.out.println("****************************************");

		 
		 System.out.println("Your name is :"+ name);
		 System.out.println("****************************************");

		 System.out.println("Your age is :"+ age );
		 System.out.println("****************************************");

		 System.out.println("Your salary is :"+ salary );
		 
		 sc.close();
          
	}

}
