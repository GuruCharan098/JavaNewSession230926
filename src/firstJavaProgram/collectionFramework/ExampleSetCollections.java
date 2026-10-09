package firstJavaProgram.collectionFramework;

import java.util.*;

public class ExampleSetCollections {

	public static void main(String[] args) {
		
//		 Set<String> names = new HashSet<>();
//		 
//		  names.add("Amit");
//		  names.add("Amit");
//		  names.add("Reena");
//		  names.add("Seema");
//
//
//		  System.out.println(names);
//		  
//		  
//		  HashSet<Integer> numbers = new HashSet<>();
//		  
//		  numbers.add(10);
//		  numbers.add(40);
//		  numbers.add(20);
//		  numbers.add(50);
//		  
//		  System.out.println(numbers);
//		  System.out.println(numbers.contains(20));
//		  numbers.remove(40);
//		  System.out.println(numbers.size());
//		  System.out.println(numbers);
		  
		  
		  TreeSet<Integer> nums = new TreeSet<>(); 
		  nums.add(30);
		  nums.add(10);
		  nums.add(40);
		  nums.add(20);
		  nums.add(50);
		  
		  nums.clear();
		  
		  System.out.println(nums);
		  
		  
		  List<Integer> values = Arrays.asList(10,20, 20, 30, 30, 40, 50, 60, 70, 70, 80);
		  
		  Set<Integer> uniqueValues = new LinkedHashSet<>(values);
		  
		  System.out.println(uniqueValues);

		  
	}
}
