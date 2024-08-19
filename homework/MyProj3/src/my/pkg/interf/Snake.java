package my.pkg.interf;

public class Snake implements InterfacePet, InterfacePet_Today {

	@Override
	public void peed() {
		System.out.println("뱀이 쥐를 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("뱀이 또아리를 틀고 잔다.");
	}

	@Override
	public void today() {
		System.out.println(this.name + "이 병원에 가는날");
		
	}

}
