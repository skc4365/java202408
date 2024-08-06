package ch03.sec05;

public class InfinityAndNaNCheckExam {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
//		Infinity
		double z1 = x / y;
//		NaN
		double z2 = x % y;
		System.out.println(z1 + ":"+ z2);
		
//		알맞은코드
//		산술연산코드의 예외처리 방법으로 사용하기 좋다.
		double z = x / y;
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("산출불가");
		}else {
			System.out.println(z);
		}
	}

}
