package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		
		int result = 0;
		
//		result = 0 + 10 = 10
		result += 10;
		System.out.println("result=" + result);		
		
//		result = 10 - 5 = 5
		result -= 5;
		System.out.println("result=" + result);
		
//		result = 5 * 3 = 15
		result *= 3;
		System.out.println("result=" + result);
		
//		result = 15 / 5 = 3
		result /= 5;
		System.out.println("result=" + result);
		
//		result = 3 % 3 = 0
		result %= 3;
		System.out.println("result=" + result);	

	}

}
