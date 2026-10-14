package firstJavaProgram.Java8thFeatures;

import java.util.concurrent.*;

public class ExampleCompletableFutureConcept {

	public static void main(String[] args) {

		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()-> {
			System.out.println("Calculating....");
			return 10; 
		});
		
		CompletableFuture<Integer> result = future.thenApply(num -> num*2);
		
		System.out.println("Result : " + result.join());
	}

}
