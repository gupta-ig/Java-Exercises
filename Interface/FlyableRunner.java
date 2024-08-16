package InterfacesRunner;

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("with wings");
	}
}

class Aeroplane implements Flyable {
	public void fly() {
		System.out.println("with fuel");
	}
}

public class FlyableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Flyable obj1 = new Bird();
		Flyable obj2 = new Aeroplane();
		
		obj1.fly();
		obj2.fly();
		*/
		
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for(Flyable object : flyingObjects) {
			object.fly();
		}
		
		
	}

}
