package ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		int num1 = 1;
//		비트값 0001의 자릿수를 좌측으로 세칸 이동해라
		int result1 = num1 << 3;
		
//		좌측 시프트 연산은 (2의3승)*곱하기한 결과값과 같이 나타난다.
		int result2 = num1 * (int) Math.pow(2, 3);  
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);

//		우측 시프트 연산은 (2의3승)/나누기한 결과값과 같이 나타난다.
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);	
		
	}

}
