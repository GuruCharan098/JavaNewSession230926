package firstJavaProgram.exceptionHandling;


class BankAcc {
	
	private double balance = 10000; 
	
	void withdraw(double amount) {
		
		if(amount <=0) {		
			throw new IllegalArgumentException("Amount must be grater then Zero....");
		}
		
		if(amount > balance) {
			throw new IllegalArgumentException("Insufficient balance....");

		}
		
		balance -= amount; 
		
		System.out.println("Remaining Balance : " + balance);
	}
}


class AgeValidator{
	
	static void validateAge(int age)  throws IllegalArgumentException {
			
			if(age < 18) {	
				throw new IllegalArgumentException("Age must be 18 or above"); 
			}
			
			System.out.println("valid age");
		}
	}

public class ExamplesExceptionHandling {

	public static void main(String[] args)  {

  // arithmetic Exception : 		
   try {
			
		int a = 10; 
		int b = 0; 
		
		int res = a/b;
		System.out.println("Finally Executed..." + res);

		}
   catch(ArithmeticException e) {
			e.printStackTrace();
		}
   finally {
			System.out.println("Finally Executed...");
		
	   }
	
  // Throw keyword example: 	
   BankAcc acc = new BankAcc();
	
	try {
		acc.withdraw(20000);
	}catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
	
	try {
		AgeValidator.validateAge(15);
	}catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}

}
