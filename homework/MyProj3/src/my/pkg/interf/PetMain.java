package my.pkg.interf;

public class PetMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Snake snake = new Snake();

		dog.today();
		cat.today();
		bird.today();
		snake.today();
		System.out.println("------------------");
		dog.peed();
		cat.peed();
		bird.peed();
		snake.peed();
		System.out.println("------------------");
		dog.sleep();
		cat.sleep();
		bird.sleep();
		snake.sleep();

	}

}
