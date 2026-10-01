package firstJavaProgram.javaOOPConcetps;

// Method Overloading : Compile Time Polymorphism. 
class Calculator{
	
	
	
	int add(int a, int b) {
		return a+b; 
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}

// Method Overriding or Runtime Polymorphism: 

 class Animals {
	 
	 void sound() {
		 System.out.println("Animal makes sound");
	 }
 }
 
 class Dogs extends Animals{
	 @Override
	 void sound() {
		 System.out.println("dog makes sound like Bark..");
	 }
 }

 class Cats extends Animals{
	 @Override
	 void sound() {
		 System.out.println("cat makes sound like Meow..");
	 }
 }
 
 
public class ExamplePolymorphismTypesConcept {

	 public static void main(String[] args) {
		 
		 Calculator c = new Calculator();
		 
		 System.out.println(c.add(2, 3));
		 System.out.println(c.add(2, 3, 4));
		 System.out.println(c.add(2.66, 3.67));
		 
		 
		 Animals animal; 
		 
		 animal = new Dogs();
		 animal.sound();
		 
		 animal = new Cats();
		 animal.sound();


		
	 }
}
