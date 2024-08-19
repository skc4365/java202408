package my.pkg;

public class Puppy {

	public static void main(String[] args) {

		Dog dog1 = new Dog("똘이");
		dog1.setColor("skyblue");
		Dog dog2 = new Dog("초코", "darkChoco");
		Dog dog3 = new Dog("모모", "pink", "말티즈");

		String out = dog1.getColor() + dog1.getName() + "와 " + dog2.getColor() + dog2.getName();
		String out2 = dog1.getKind();
		String out3 = dog3.getColor() + dog3.getName();

		System.out.println(
				"우리집에는 " + out + " " + ", 두 마리의 " + out2 + 
				"그리고 " + out3 + " "+ dog3.getKind() + " 모두 함께 살아요");

	}

}
