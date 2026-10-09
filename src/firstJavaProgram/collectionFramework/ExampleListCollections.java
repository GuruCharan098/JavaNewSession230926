package firstJavaProgram.collectionFramework;

import java.util.*;

public class ExampleListCollections {

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
		
		
//		LinkedList<String> names =  new LinkedList<>();
//	
//		names.add("Amit");
//	    names.add("Rahul");
//		names.add("Amit");
//		
//		names.addFirst("Ravi");
//		names.addLast("Neha");
//		
//		
//		System.out.println(names);
		
		
//		// Vector Example: 
//		
//		  Vector<String> names = new Vector<>();
//		   names.add("Amit");
//		   names.add("Rahul");
//		   names.addFirst("Reena");
//		   
//		   System.out.println("Data : "+ names);
//		   
//		 
//		 // Stack Example: 
//		   
//		   Stack <Integer> data = new Stack<>();
//		   // Last In, First Out: 
//		   data.push(10);
//		   data.push(20);
//		   data.push(30);
//		   data.push(40);
//		   
//		   System.out.println(data.pop());
//		   
//
//		   for(int n : data) {
//			   System.out.println(n);
//		   }
//
//		   
//		  // Cursor : 
//		   // a. Iterator
//		       
//		     ArrayList<String> users = new ArrayList<>();
//		     ArrayList<Integer> nums = new ArrayList<>();
//		       users.add("Amit"); 
//		       users.add("Seema"); 
//		       users.add("Rama"); 
//		       users.add("Abhay"); 
//		       users.add("Hemant"); 
//		       
//		       nums.add(100);
//		       nums.add(200);
//		       nums.add(300);
//		       nums.add(400);
//
//		       Iterator<Integer> itr1 = nums.iterator();
//		       
//		       while(itr1.hasNext()) {
//		    	   
//		    	   int number = itr1.next();
//		    	   
//		    	   if(number == 200) {
//		    		   itr1.remove();
//		    	   }
//		       }
//		       System.out.println(nums);
//		       
//		       Iterator<String> itr = users.iterator();
//		       
//		       while(itr.hasNext()) {
//		    	   String name = itr.next();
//		    	   System.out.println(name);
//		       }

		     
		       // b.  ListIterator:
		       
		           ArrayList<String> studentNames = new ArrayList<>();
		           
		           studentNames.add("React");
		           studentNames.add("Angular");
		           studentNames.add("Java");
		           studentNames.add("Python");
		           
		           
		           ListIterator<String> item = studentNames.listIterator();
		           
			       System.out.println("Forward");
			       
			       while(item.hasNext()) {
				       System.out.println(item.next());
			       }
			       System.out.println("Backward");
			       
			       while(item.hasPrevious()) {
				       System.out.println(item.previous());

			       }


		       // c. Enumration : 
			       
			       Vector<Integer> Result = new Vector<>();
			       
			       Result.add(10);
			       Result.add(20);
			       Result.add(30);
			       Result.add(40);
			       Result.add(50);
			       
			       Enumeration<Integer> n = Result.elements();
			       
			       while(n.hasMoreElements()) {
				       System.out.println(n.nextElement());

			       }


		       
		       
		     
		     
		     
	 }

}

