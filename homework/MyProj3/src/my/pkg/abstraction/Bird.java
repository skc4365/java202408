package my.pkg.abstraction;

public class Bird extends SuperPet  {
	@Override
	public void peed() {
		System.out.println("새가 먹이를 먹는다.");
	}

	@Override
	public void petSound() {
		System.out.println("쪼롱 쪼로롱~");
		
	}
}
