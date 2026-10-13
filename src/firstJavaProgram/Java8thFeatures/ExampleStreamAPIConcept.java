package firstJavaProgram.Java8thFeatures;
import java.util.*;
import java.util.stream.Collectors;


class Employees{
	
	String name;
	String department; 
	
	Employees(String name, String department){
		this.name = name;
		this.department = department; 
	}
	
	@Override
	public String toString() {
		return name; 
	}
}

public class ExampleStreamAPIConcept {

	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(10, 20, 12, 20, 25, 35, 40);
//		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
//		
//		numbers.stream()
//		       .filter(n -> n% 2 == 0)
//		       .distinct()
//		       .forEach(System.out::println);
//		
//		data.stream()
//		    .map(n -> n * n )
//		    .forEach(System.out::println);
		
		
		// Collectors : 		
       List<Integer> student = Arrays.asList(10, 15, 20, 25, 30);
       
       
       List<String> name = Arrays.asList("Java", "React", "JavaScript", "HTML", "CSS");
       
         List<String> response = name.stream()
        		 .map(String::toLowerCase)
        		 .collect(Collectors.toList());
         
         System.out.println(response);
         

	     List<Integer> result = student.stream()
	    		 .filter(n -> n >= 20)
	    		 .collect(Collectors.toList());
	     
	     System.out.println(result);
	     
	     
	     
	     List<Employees> employee = Arrays.asList(
	    		 new Employees("Amit", "IT"),
	    		 new Employees("Raman", "CS"),
	    		 new Employees("Rekha", "IT"),
	    		 new Employees("Deepa", "QA"),
	    		 new Employees("Aman", "QA")
	    		 );
	     
	     Map<String, List<Employees>> grouped = employee.stream()
	    		   .collect(Collectors.groupingBy((e)-> e.department));
	     
	     System.out.println(grouped);
	     
	     
	     // Parallel Stream : 
	     
	     List<Integer> num = Arrays.asList(10, 20, 30, 40, 50, 60);
	     
	     int total = num.parallelStream()
	    		         .mapToInt(Integer::intValue)
	    		         .sum();
	     
	     System.out.println(total);
	    
	}
}
