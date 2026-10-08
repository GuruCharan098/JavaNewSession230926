package firstJavaProgram.collectionFramework;

import java.util.*;

public class ExamplesCollectionFramework {

	public static void main(String[] args) {

		// Iterable Collection : 
		//List<String> names = new ArrayList<>();
		//ArrayList<String> names = new ArrayList<>();
//		names.add("Amit");
//		names.add("Rahul");
//		names.add("Amit");
//		
//		
//		names.set(0, "Aman");
		//System.out.println(names.get(0));
		//names.get(2);
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
		//System.out.println(names);
//		System.out.println(names.size());
//		System.out.println(names.contains("Amit"));
		
		
		LinkedList<String> names =  new LinkedList<>();
		
		names.add("Amit");
		names.add("Rahul");
		names.add("Amit");
		
		names.addFirst("Ravi");
		names.addLast("Neha");
		
		
		System.out.println(names);



	}

}
