package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {

		//	   ssn = [0123456...]
		String ssn = "9506241230123";
//		몇 번째 문자를 변수에 담을지
		char sex = ssn.charAt(6);
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;

		}

	}

}
