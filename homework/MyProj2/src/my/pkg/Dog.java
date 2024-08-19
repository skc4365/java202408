package my.pkg;

public class Dog {

	private String name;
	private String color;
	private String kind = "푸들";

	public Dog(String name) {
		this.name = name;
	}

	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Dog(String name, String color, String kind) {
		this.name = name;
		this.color = color;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
