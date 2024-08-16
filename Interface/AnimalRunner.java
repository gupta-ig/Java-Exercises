package InterfacesRunner;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {new Cat(), new Dog() };
		for(Animal obj : animals) {
			obj.bark();
		}
 	}

}
