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
	      
	       void checkVowelsConsonants() {
	    	   
	    	     String str = "Java Programming";    
	    	     int vowels  = 0;
	    	     int consonants = 0; 
	    	     
	    	     for(int i=0; i< str.length(); i++) {
	    	    	 char ch = str.toLowerCase().charAt(i); 	    	    	 
	    	    	 if(ch >= 'a' && ch <='z') {
	    	    		 
	    	    		 if(ch =='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u') {
	    	    			 vowels++;
	    	    		 }else {
	    	    			 consonants++;
	    	    		 }
	    	    	 }
	    	     }
	    	     
	    	     System.out.println("Vowels : " + vowels);
	    	     System.out.println("Consonants : " + consonants);    	     
	    	     
	       }
	      
	       void duplicateCharactersInText() {
	    	   
	    	   String Str = "Java programming"; 
	    	   
	    	   for(int i=0; i<Str.length(); i++) {
	    		   
	    		   char ch = Str.charAt(i);
	    		   
	    		   if(Str.indexOf(ch) != i) {
	    			   continue;  			   
	    		   }
	    		   
	    		   if(Str.indexOf(ch, i+1) != -1) {
	    			   System.out.println("Duplication : " + ch);
	    		   }
	    	   }
	       }
	      
        public static void main(String[] args) {
        	
        	ExamplesStringManipulation SM = new ExamplesStringManipulation(); 
        	SM.reverseString();
        	SM.checkPalindromeString();
        	SM.checkVowelsConsonants();
        	SM.duplicateCharactersInText();
        }
}
