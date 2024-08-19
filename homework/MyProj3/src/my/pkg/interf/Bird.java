package my.pkg.interf;

public class Bird implements InterfacePet, InterfacePet_Today  {

	@Override
	public void peed() {
		System.out.println("새가 모이를 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("새가 새장에서 잔다.");		
	}

	@Override
	public void today() {
		System.out.println(this.name + "이 병원에 가는날");
		
	}
}
