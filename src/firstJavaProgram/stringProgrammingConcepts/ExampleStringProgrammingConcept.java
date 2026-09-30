package firstJavaProgram.stringProgrammingConcepts;
import java.util.StringTokenizer;

public class ExampleStringProgrammingConcept {

	public static void main(String[] args) {

		
		 //StringBuffer  StrBuffer = new StringBuffer("Java"); 
		 
		 
//		 StrBuffer.append(" Programming");
//		 StrBuffer.insert(4, " Full Stack");
//		 StrBuffer.replace(0, 4, "Python");
//		 StrBuffer.delete(0, 7);
//		 
//		 System.out.println(StrBuffer);
		 
		 
//		 StringBuilder StrBuilder = new StringBuilder("Web"); 
//		 
//		  StrBuilder.append(" Pages");
//		  StrBuilder.insert(4, " Full Stack ");
//		  
//		  System.out.println(StrBuilder);
		
		String str = "Java,Python,React(HTML-CSS),Spring";

		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		  
		  
		  
	} 

}
