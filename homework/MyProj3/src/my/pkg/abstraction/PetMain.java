package my.pkg.abstraction;

public class PetMain {

	public static void main(String[] args) {
		
//		abstract : 반드시 상속하여 사용해야 한다.

		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Snake snake = new Snake();

		dog.peed();
		cat.peed();
		bird.peed();
		snake.peed();
		System.out.println("-----------------");
		dog.petSound();
		cat.petSound();
		bird.petSound();
		snake.petSound();
		System.out.println("-----------------");
		SuperPet.today();
		System.out.println("-----------------");
		dog.sleep();
		cat.sleep();
		bird.sleep();
		snake.sleep();

	}

}
