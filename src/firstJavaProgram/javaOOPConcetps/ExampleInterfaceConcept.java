package firstJavaProgram.javaOOPConcetps;

interface Payment{
	void pay();
}

class UPI implements Payment{
	
	@Override 
	public void pay() {
		System.out.println("Payment using UPI...");
	}
}

class Card implements Payment{
	
	@Override
	public void pay() {
		System.out.println("Payment using Cards...");
	}
}

public class ExampleInterfaceConcept {

	 public static void main(String[] args) {
		 
		 Payment p1 = new UPI();
		 Payment p2 = new Card();
		 
		 p1.pay();
		 p2.pay();
		 
	 }
}
