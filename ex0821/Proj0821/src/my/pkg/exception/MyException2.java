package my.pkg.exception;

public class MyException2 {

	//	예외발생 커스터마이징하기
	private static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("입장가능 - 청소년관람");
		} else {
			System.out.println("-----");
		}
	}

	public static void main(String[] args) {

		checkAge(15);
	}

}
