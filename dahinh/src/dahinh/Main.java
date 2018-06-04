package dahinh;

public class Main {

	public static void main(String[] args) {
	Animal dog = new Dog();
	Animal duck = new Duck();
	Animal chicken = new Chicken();
	Animal animal = new Animal();
	System.out.println("Cho");
	dog.speak();
	duck.speak();
	chicken.speak();
	animal.speak();
	duck.setNumberOfLeg(2);
	duck.getNumberOfLeg();

	}

}
