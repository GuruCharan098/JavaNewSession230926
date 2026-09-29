package firstJavaProgram.statements;


class ConditionalStatements{
	
	 void ifEaxmple() {
		  
		 int age = 20; 
		 
		 if(age>=18)
			 System.out.println("Eligible");
	 }
	 
	 void ifElseExample() {
		 
		  int marks = 45;
		  
		  if(marks >= 50)
		     System.out.println("Pass");
	      else
			 System.out.println("Fail"); 
				  		  
	 }
	 
	 void elseIfLadder() {
		 
		  int marks = 75; 
		  
		  if(marks>= 90)
			  System.out.println("Grade A+");
		  else  if(marks>= 75)
			  System.out.println("Grade A");
		  else  if(marks>= 65)
			  System.out.println("Grade B");
		  else  if(marks>= 45)
			  System.out.println("Grade C");
		  else  if(marks>= 35)
			  System.out.println("Pass");
		  else
			 System.out.println("Fail");
			  
	 }
	 
	 void nestedIfExample() {
		 
		  int age = 20; 
		  boolean hasId = true; 
		  
		  if(age>=18) {
			  if(hasId) {
				  System.out.println("Entry Allowed.."); 
			  }
		  }
	 }
	 
	 void switchCaseExample() {
		 
		   int day = 7; 
		   
		   switch(day) {
		           
		      case 1:
		    	  System.out.println("Monday");
		    	  break;	  
		      case 2:
		    	  System.out.println("Tuesday");
		    	  break;
		      case 3:
		    	  System.out.println("Wednesday");
		    	  break;
		      case 4:
		    	  System.out.println("Thursday");
		    	  break;
		      case 5:
		    	  System.out.println("Friday");
		    	  break;
		      case 6:
		    	  System.out.println("Saturday");
		    	  break;
		      case 7:
		    	  System.out.println("Sunday");
		    	  break;
		    	  
		      default:
		    	  System.out.println("Invalid day count...");
		   }
		 
	 }
}

class LoopStatements{
	
	    void forLoopExample() {
	    	
	    	for(int i=1; i<=5; i++) {
	    		System.out.println(i);
	    	}
	    	
	    }
	    
	    void whileLoopExample() {
	    	 
	    	int k = 6; 	
	    	while(k <= 5) {
	    		System.out.println(k);
	    		k++;
	    	}
	    }
	    
	    void doWhileLoopExample() {
	    	 
	    	int j = 1; 
	    	
	    	do {
	    		System.out.println(j);
	    		j++;
	    		System.out.println(j);
	    	}while(j<=5);
	    }
}
public class ExamplesStatements {
	
	  void  breakStatement() {
		   int[] num = {10, 20, 40, 50, 30};
		   
		    for( int n : num) {
		    	if(n == 30) {
		    		System.out.println("Number found: "+ n);
		    		break;
		    	}else
		    		System.out.println("Number is Not found: "+ n);
		    }
		  
		     for(int i=1; i<=10; i++) {
		    	 
		    	 if(i==5) {
		    		 System.out.println(i);
		    		 break;
		    		 }
		    	 System.out.println(i);
		     }
	  }

	  void continueStatement() {
		  
		   for(int k = 1; k<=10; k++) {
			   
			   if(k % 2 == 0)
				   continue;
			   System.out.println(k);
		   }
			   
	  }
	public static void main(String[] args) {
		
		
		ExamplesStatements ES = new ExamplesStatements();
		ES.breakStatement();
        System.out.println("__________________________________________");
		ES.continueStatement();
		
//		ConditionalStatements CS = new ConditionalStatements();
//		CS.ifEaxmple();
//        System.out.println("__________________________________________");
//		CS.ifElseExample();
//        System.out.println("__________________________________________");
//        CS.elseIfLadder();
//        System.out.println("__________________________________________");
//        CS.nestedIfExample();
//        System.out.println("__________________________________________");
//        CS.switchCaseExample();
        
        System.out.println("******************************************************");
//        
//        LoopStatements LS = new LoopStatements();
//        LS.forLoopExample();
//        System.out.println("__________________________________________");
//        LS.whileLoopExample();
//        System.out.println("__________________________________________");
//        LS.doWhileLoopExample();
        


	}

}
