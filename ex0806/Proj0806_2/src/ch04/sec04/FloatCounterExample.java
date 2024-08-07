package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {

//		for(float 초기값; x<=최종값; x+=증감값)
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			
//			부동 소숫점 float은 실제값보다 미세하게 약간 더 큰 값을 가진다.
			System.out.println(x);
		}
	}

}
