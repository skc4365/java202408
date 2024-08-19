package my.pkg.interf;

public class Dog implements InterfacePet, InterfacePet_Today {

	@Override
	public void peed() {
		System.out.println("강아지가 사료를 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("강아지가 새집에서 잔다.");
	}

	@Override
	public void today() {
		System.out.println(this.name + "이 병원에 가는날");
		
	}
}
