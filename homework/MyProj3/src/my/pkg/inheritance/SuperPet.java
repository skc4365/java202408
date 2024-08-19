package my.pkg.inheritance;

public class SuperPet {

	private String name;
	
	static void today() {
		System.out.println("오늘은 병원가는날!!!");
	}

	public void peed() {
		System.out.println("먹이를 먹는다.");
	}

	public void sleep() {
		System.out.println("잠을 잔다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void outPrint() {
		System.out.println("나는 수퍼클래스");
	}
}
