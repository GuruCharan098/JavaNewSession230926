package firstJavaProgram.Java8thFeatures;

import java.util.function.*;

public class ExampleFunctionalInterfaces {

	public static void main(String[] args) {

		
		Predicate<Integer> isEven = n -> n%2 == 0; 
		
		Function<Integer, Integer> square = n -> n*n; 
		
		Consumer<String> print = text -> System.out.println(text);
		
		Supplier<String> message = () -> "Hello Java 8 features...";
		
		
		System.out.println(isEven.test(10));
		System.out.println(square.apply(5));
		
		print.accept("Learning Function Interfaces...");
		System.out.println(message.get());

	}

}
