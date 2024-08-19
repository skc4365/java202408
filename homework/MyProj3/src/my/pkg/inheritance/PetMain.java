package my.pkg.inheritance;

public class PetMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Snake snake = new Snake();
//		기본클래스간의 상속은 수퍼클래스도 오브젝트로 접근할 수 있다.
		SuperPet superPet = new SuperPet();
		
		superPet.outPrint();
		System.out.println("-----------------");
		dog.peed();
		cat.peed();
		bird.peed();
		snake.peed();
		System.out.println("-----------------");
//		static메소드 접근
		SuperPet.today();
		System.out.println("-----------------");
		dog.sleep();
		cat.sleep();
		bird.sleep();
		snake.sleep();

	}

}
