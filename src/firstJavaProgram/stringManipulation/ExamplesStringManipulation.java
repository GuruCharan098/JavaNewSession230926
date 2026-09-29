package firstJavaProgram.stringManipulation;

public class ExamplesStringManipulation {
	     
	      void reverseString() {
	    	  
	    	  String str = "Java";
	    	  String reverseStr = "";
	    	  
	    	  for(int i= str.length() - 1; i>=0;  i--) {
	    		  reverseStr += str.charAt(i);
	    	  }
	    	  
	    	  System.out.println("Origial :"+ str.toLowerCase());
	    	  System.out.println("Updated :"+ reverseStr.toLowerCase());

	      }
	      
	      void checkPalindromeString() {
	    	     
	    	      String simpleText = "Level"; 
	    	      String reverseText = ""; 
	    	      
	    	      for(int i= simpleText.length() - 1; i>=0;  i--) {
	    	    	  reverseText += simpleText.charAt(i);
		    	  }
	    	       if(simpleText.toLowerCase().equals(reverseText.toLowerCase())) {
	    	    	   
	    	    	   System.out.println("Palindrome Text");
	    	       }else{
	    	    	   System.out.println("Not Palindrome Text");
	    	       }
	    	    }
	      
        public static void main(String[] args) {
        	
        	ExamplesStringManipulation SM = new ExamplesStringManipulation(); 
        	SM.reverseString();
        	SM.checkPalindromeString();
        }
}
