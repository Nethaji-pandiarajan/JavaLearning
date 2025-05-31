
public class InheritanceLearning {
	public static void main(String[] args) {
		Animal d = new Dog();
		Cat rossy = new Cat();
		rossy.rossy();
		Dabur myPet = new Dabur();
		myPet.sitting();
	}
	
	
}
class Animal{
	 void eating(){
		System.out.println("Animal is eating");
	}
}
class Insect {
	public void fly() {
		System.out.println("Insect are Flying");
	}
}

class Dog extends Animal{
	void bark() {
		super.eating();
		System.out.println("Dog is barking");
	}
}

class Dabur extends Dog {
	public void sitting() {
		System.out.println("Dabur is sitting");
	}
}
class Cat extends Animal{
	public void rossy() {
		System.out.println("Rossy is shouting");
	}
	
	
}


