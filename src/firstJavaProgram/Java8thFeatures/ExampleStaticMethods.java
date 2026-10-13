package firstJavaProgram.Java8thFeatures;

interface Calculators {
	
	static int add(int a, int b) {
		return a + b; 
	}
}

public class ExampleStaticMethods {

	public static void main(String[] args) {

		int result = Calculators.add(10, 20);
		
		System.out.println(result);
		
	}

}
