package InterfacesRunner;

abstract class Animal {
	void bark() {
		
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	void bark() {
		System.out.println("Meow Meow");
	}
}
