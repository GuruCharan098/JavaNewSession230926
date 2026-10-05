package firstJavaProgram.javaOOPConcetps;

class Room{
	
	void showRoom() {
		System.out.println("1 BHK"); 
	}
}

class House{
	
	private Room r = new Room();
	
	void showHouse() {
		r.showRoom();
	}
}

public class ExampleCompositionConcept {

	public static void main(String[] args) {

		 House h = new House();
		 
		 h.showHouse();
		
	}

}
