package firstJavaProgram.Java8thFeatures;

import java.util.Optional;

public class ExampleOptionalColllection {

	public static void main(String[] args) {

		String name = "Guru charan"; 
		
		Optional<String> optionalName = 
				  Optional.ofNullable(name);
		
		String result = optionalName.orElse("Guest");
		String a = optionalName.orElseGet(()-> "Guest");

		
//		System.out.println(result);
		System.out.println(a);
		
		optionalName.ifPresent(
				value -> System.out.println(value));
	}
	

}
