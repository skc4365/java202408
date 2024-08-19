package my.pkg.abstraction;

public class Dog extends SuperPet {
	@Override
	public void peed() {
		System.out.println("강아지가 먹이를 먹는다.");
	}

	@Override
	public void petSound() {
		System.out.println("멍멍~~");
		
	}
}
