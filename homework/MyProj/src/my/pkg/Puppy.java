package my.pkg;

public class Puppy {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("똘이");
		Dog dog2 = new Dog("초코", "darkChoco");
		
		
		String out = 
				dog1.name + "와 " + dog2.color + dog2.name;
		String out2 = dog1.kind;
		
		System.out.println(
				"우리집에는 " +  out + " " + 
				", 두 마리의 "  + out2 + "이 함께 살아요");
		
		
	}

}
