package my.pkg.inheritance;

public class Pet {
//	필드 선언
	public String name;
	public String kind;
	public String color;
	
	public Pet(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	void sound() {
		System.out.println("동물이 웁니다.");
	}
}
