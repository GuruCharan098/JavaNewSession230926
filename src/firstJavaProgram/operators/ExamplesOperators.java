package firstJavaProgram.operators;


class ArithmeticOpeartors{
	 
	  void add() {
		  int a = 10, b = 20; 
		  System.out.println("Addition : "+ (a + b));
	  }
	  
	  void sub() {
		  int a = 30, b = 20; 
		  System.out.println("Subtract : "+ (a - b));
	  }
	  
	  void mul() {
		  int a = 10, b = 20; 
		  System.out.println("Multiply : "+ (a * b));
	  }
	  
	  void div() {
		  int a = 20, b = 5; 
		  System.out.println("Division : "+ (a / b));
	  }
	  
	  void remainder() {
		  int x = 3, y = 2; 
		  System.out.println("Remainder : "+ (x % y));
	  }
	
}

class RelationalOpeartors{
	   int i = 10; 
	   int j = 20; 
	   
	   {
		   System.out.println(i==j);
		   System.out.println(i!=j);
		   System.out.println(i>j);
		   System.out.println(i<j);
		   System.out.println(i>=j);
		   System.out.println(i<=j);

	   }
}

class LogicalOperators{
	 void andOperator(){
		 int age = 27; 
		 boolean hasId = true; 
		 
		 if(age>= 18 && hasId) {
			 System.out.println("Eligible");
		 }else {
			 System.out.println("Not Eligible");
		 }
	 }
	 void orOperator() {
		 int age = 27; 
		 boolean hasId = false; 
		 
		 if(age>= 18 || hasId) {
			 System.out.println("Eligible");
		 }else {
			 System.out.println("Not Eligible");
		 }
	 }
	 void notOperator(){
		 int age = 27; 
		 boolean hasId = true; 
		 
		 if(!(age>= 18 && hasId)) {
			 System.out.println("Eligible");
		 }else {
			 System.out.println("Not Eligible");
		 }
	 }
}

class AssigmentOperators{
	
	 int num = 10; 
	 
	 {
		 num += 5; 
		 System.out.println(num);
		 System.out.println("************");

		 num -= 2; 
		 System.out.println(num);
		 System.out.println("************");

		 num *= 5; 
		 System.out.println(num);
		 System.out.println("************");

		 num /= 5; 
		 System.out.println(num);
		 System.out.println("************");

		 num %= 3; 
		 System.out.println(num);
		 
	 }
}

class IncreAndDecreOperators{
//	   boolean avc; 	
//      { String result =  (avc == true) ? "eligible" : "not eligible" ; }

	
	    void incrementOp() {
	    	
	    	 int a = 10; 
	    	 a++;    // prefix ++
	    	 System.out.println(a);
	    	 System.out.println(++a); // postfix/suffix ++
	    }	    
	    
	    void decrementOp() {
	    	int b = 20; 
	    	 b--; // prefix --
	    	 System.out.println(b); 
	    	 System.out.println(--b); // postfix/suffix --
	    }
	
}

public class ExamplesOperators {
      public static void main(String[] args) {
    	  
    	 // int[] numbers = new int[5];
          int [] numbers = {80, 70, 90, 95, 85};
          
          // for loop ---> return value
          for(int i=0; i<numbers.length; i++) {
        	  //System.out.println(numbers[i]);
          }
          
          // for each ---> return object
          for(int k : numbers) {
        	//  System.out.println(k);
          }

    	  //System.out.println("Array length is : "+ numbers.length +" "+ numbers[0]+" "+ numbers[1]);
          
//          ArithmeticOpeartors AO = new ArithmeticOpeartors();
//          AO.add();
//          AO.sub();
//          AO.mul();
//          AO.div();
//          AO.remainder();
//          System.out.println("__________________________________________");
//          RelationalOpeartors RO = new RelationalOpeartors();
    	  
          System.out.println("__________________________________________");
//          
//          LogicalOperators LO = new LogicalOperators();
//          LO.andOperator();
//          LO.orOperator();
//          LO.notOperator();
    	  
          System.out.println("__________________________________________");
          
          //AssigmentOperators AssignO = new AssigmentOperators();
          
          IncreAndDecreOperators IDO = new IncreAndDecreOperators();
          
          IDO.incrementOp();
          IDO.decrementOp();
          
          
//          if()else
        	  
          
    	  
      }
}
