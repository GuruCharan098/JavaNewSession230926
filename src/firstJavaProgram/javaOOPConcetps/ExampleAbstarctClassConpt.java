package firstJavaProgram.javaOOPConcetps;


abstract class Animal{
	   abstract void sound();
	   
	   void eat() {
		   System.out.println("Animal is eating"); 
	   }
}

class Dog extends Animal{
	
	@Override
	void sound() {
		System.out.println("Dogs makes sounds... Brak."); 
	}
	
}
class Cat extends Animal{
	
	@Override
	void sound() {
		System.out.println("Cats makes sounds... Meow."); 
	}
}

public class ExampleAbstarctClassConpt {
            
	   public static void main(String[] args) {
		  
		   Dog dg = new Dog();
		   Cat ct = new Cat();
		   
		   Animal an1 = new Dog(); 
		   Animal an2 = new Cat(); 
		   
		   an1.eat();
		   an2.eat();
		   
		   an1.sound();
		   an2.sound();
		   
		   
		   dg.eat();
		   ct.eat();
		   
		   dg.sound();
		   ct.sound();
		   
		   
	   }
}
