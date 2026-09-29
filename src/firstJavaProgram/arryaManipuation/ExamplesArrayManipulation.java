package firstJavaProgram.arryaManipuation;

public class ExamplesArrayManipulation {
	
	     String name = "javaprogramming";
	     {
	    	 System.out.println(name.substring(0,7));
	    	 System.out.println(name.replace("java","Python"));

	     }
	     
	     void arrayManipuationMethod() {
	    	 
	    	 int[] numbers = {10, 20, 30, 40, 50};
	    	 
	    	  int sum = 0;
	    	  int max = numbers[0];
	    	  
	    	  for(int n : numbers) {
	    		  sum += n; 
	    	  }
	    	  
	    	  for(int num : numbers) {
	    		  if(num > max) {
	    			  max = num; 
	    		  }
	    	  }
	    	  
	    	 System.out.println(sum);
	    	 System.out.println(max);
	     }
  
	     void singleArrayManipuation1D() {
	    	 
	    	  int[] studentsMarks = {80, 75, 70, 90, 85, 95}; 
	    	  
	    	  for(int i = 0; i < studentsMarks.length; i++) {
	    		  System.out.println("Mark-"+( i+1 )+":"+ studentsMarks[i]);
	    	  }
    		  System.out.println(studentsMarks[2]);

	     }
	     
	     void twoDArraysManipuation() {
	    	 
	    	 int[][] numbers2D = {     
                    {10, 20, 30},
                    {40, 50, 60},
                    {70, 80, 90}
                    };
	    	 
	    	  System.out.println(numbers2D[1][2]);
	    	  
	    	 for(int i=0; i<numbers2D.length; i++) {
	    		 for(int j=0; j<numbers2D[i].length; j++) {
	    			 System.out.print(numbers2D[i][j]+" ");
	    		 }
	    		 System.out.println();
	    	 }
	    	 
	    	 
	     }
	 
	     void simplePatternDemo() {
	    	  
//                Required Output: 
//                	        * * * *
//                	        * * * *
//                	        * * * *
//                	        * * * *
	    	  
	    	     for(int x=1; x<=4; x++) {
	    	    	 for(int y=1; y<=4; y++) {
	    	    		 System.out.print("* ");
	    	    	 }
	    	    	 System.out.println();
	    	     }
	      }
	      
	     void  trianglePatternDemo() {
//      Right-angled triangle
//	    	    *
//	    	    * * 
//	    	    * * *
//	    	    * * * *
//	    	    * *	* * * 
	    	   
	    	    for(int r=1; r<=5; r++) {
	    	    	for(int c=1; c<=r; c++) {
	    	    		System.out.print("* ");
	    	    	}
	    	    	System.out.println();
	    	    };
//	    	    column then row:
//	    	    Number pattern: 
//	    	    1 
//	    	    1 2 
//	    	    1 2 3 
//	    	    1 2 3 4 
//	    	    1 2 3 4 5 
	    	    
	    	    for(int i=1; i<=5; i++) {
	    	    	for(int j=1; j<=i; j++){
	    	    		System.out.print(j +" ");
	    	    	}
	    	    	System.out.println();
	    	    };
	    	    
//	    	    Row then column: 
//	    	    1 
//	    	    2 2 
//	    	    3 3 3
//	    	    4 4 4 4
//	    	    5 5 5 5 5
	    	    for(int i=1; i<=5; i++) {
	    	    	for(int j=1; j<=i; j++){
	    	    		System.out.print(i +" ");
	    	    	}
	    	    	System.out.println();
	    	    };
	    	    
	    	   
	       }
	     
	     void jaggedArrayDemo() {
	    	 
	    	 int[][] jaggedNums = new int[4][];
	    	 
	    	 jaggedNums[0] = new int[] {10, 20};
	    	 jaggedNums[1] = new int[] {30, 40, 50};
	    	 jaggedNums[2] = new int[] {60};
	    	 jaggedNums[3] = new int[] {70, 80, 90, 100};
	    	 
	    	 
	    	 for(int i=0; i<jaggedNums.length; i++) {
	    		 for(int j=0; j<jaggedNums[i].length; j++) {
	    			 System.out.print(jaggedNums[i][j] +" ");
	    			 
	    		 }
	    		 System.out.println();
	    	 }

	     }
	     
	     public static void main(String[] args) {
		  
		  ExamplesArrayManipulation AM = new ExamplesArrayManipulation(); 
//		  AM.arrayManipuationMethod();
//		  AM.singleArrayManipuation1D();
//		  AM.twoDArraysManipuation();
		  AM.simplePatternDemo();
	    	System.out.println("_____________________________________");
		  AM.trianglePatternDemo();
	    	System.out.println("_____________________________________");
		  AM.jaggedArrayDemo();
	  }

}
