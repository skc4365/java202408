package my.pkg.interf;

public class Cat implements Pet {
	String name;
	String kind;
	String color;
	private String sound = "야옹";
	
	@Override
	public void animal(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	@Override
	public void sound() {
		System.out.println(this.sound);
	}
}