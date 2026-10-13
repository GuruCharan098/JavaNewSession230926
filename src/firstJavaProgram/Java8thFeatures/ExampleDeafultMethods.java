package firstJavaProgram.Java8thFeatures;

interface Vehicle{
	void start();
	
	default void stop() {
		System.out.println("Vehicle Stopped....");
	}
}

class Car implements Vehicle{
	
	@Override 
	public void start() {
		System.out.println("Car Started...");
	}
}

public class ExampleDeafultMethods {

	public static void main(String[] args) {
		
		Car c = new Car(); 
		
		c.start();
		c.stop();
	}
	
}
