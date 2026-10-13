package firstJavaProgram.Java8thFeatures;
import java.util.*;
import java.util.function.*;

public class ExampleMethodInterfaces {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rahul", "Amit", "Priya");
		
		names.forEach(System.out::println);
//		System.out::println
//		(name) -> System.out.println(name); 
		
		
		Consumer<String> printer = System.out::println;
		printer.accept("this is a Java Method Reference");
	
	}

}
