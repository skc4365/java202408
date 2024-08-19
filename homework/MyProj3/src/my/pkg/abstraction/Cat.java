package my.pkg.abstraction;

public class Cat extends SuperPet  {
	@Override
	public void peed() {
		System.out.println("고양이가 먹이를 먹는다.");
	}

	@Override
	public void petSound() {
		System.out.println("야옹~~");
		
	}
}
