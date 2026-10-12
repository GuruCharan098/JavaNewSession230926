package firstJavaProgram.collectionFramework;
import java.util.*;

public class ExampleMapCollections {

	 public static void main(String[] args) {
		 
		// Map<Integer, String> employee = new HashMap<>();
//		 
//		 employee.put(101, "Sita Kumari");
//		 employee.put(102, "Reena Yadav");
//		 employee.put(103, "Kavya Singh");
//		 employee.put(104, "Divya Kumari");
//		 
//		 System.out.println(employee);
//         employee.put(102, "Sneha Thakur");
//		 System.out.println("Employee No. 2 : "+ employee.get(102));
		 
//	 Map<Integer, String> employee = new LinkedHashMap<>();
//		 
//		 employee.put(101, "Sita Kumari");
//		 employee.put(104, "Divya Kumari");
//		 employee.put(103, "Kavya Singh");
//		 employee.put(102, "Reena Yadav");
//	
//		 System.out.println(employee);
		 
		 
		 Map<Integer, String> employee = new TreeMap<>();
		 
		 employee.put(101, "Sita Kumari");
		 employee.put(104, "Divya Kumari");
		 employee.put(103, "Kavya Singh");
		 employee.put(102, "Reena Yadav");
//		 
//		 for(Integer key : employee.keySet()) {
//			 System.out.println(key + "=" + employee.get(key));
//		 }
		 
//		 
//		 for(Map.Entry<Integer, String> entry: employee.entrySet()) {
//			 System.out.println(entry.getKey()+"="+entry.getValue());
//		 }
//		 
//		 employee.forEach((key, value)->{
//			 System.out.println(key+"="+value);
//		 });
	
		 System.out.println(employee);
	 }
}
