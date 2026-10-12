package firstJavaProgram.Java8thFeatures;

@FunctionalInterface
  interface Calculator{
	
	int calculate(int a, int b);
}

public class ExampleJavaLambdaExpression {

	public static void main(String[] args) {
		
		
		
		Calculator addition = (a,b) -> a+b;
		Calculator multiplication = (a,b) -> a*b;
		
		System.out.println(addition.calculate(10, 20));
		System.out.println(multiplication.calculate(3, 12));

		
		// Traditional code
		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.out.println("Task is running....");
			}				
		};

		
		// Java 8 feature (Lambda Expression)
		Runnable task1 = () -> 
		           System.out.println("Task running from Lambda Expression");
		
		task.run();
		task1.run();
	}

}
