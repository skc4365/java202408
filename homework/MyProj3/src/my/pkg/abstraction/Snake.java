package my.pkg.abstraction;

public class Snake extends SuperPet {
	@Override
	public void peed() {
		System.out.println("뱀 먹이를 먹는다.");
	}

	@Override
	public void petSound() {
		System.out.println("스르륵~~");
		
	}
}
