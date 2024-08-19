package my.pkg.interf;

public class Cat implements InterfacePet, InterfacePet_Today  {

	@Override
	public void peed() {
		System.out.println("고양이가 생선을 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("고양이가 캣타워에서 잔다.");
	}

	@Override
	public void today() {
		System.out.println(this.name + "이 병원에 가는날");
		
	}

}
