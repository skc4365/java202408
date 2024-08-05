package ch02.sec01;

public class FloatDoubleExam {

	public static void main(String[] args) {
		
//      float: 숫자끝에 f를 붙여준다
		float var1 = 0.1234567890123456789f;
		
//		자바는 소숫점(.)만나면 기본적으로 double이라고 인식한다.
		double var2 = 0.1234567890123456789;
		System.out.println(var1);
		System.out.println(var2);
		
//		지수표현 e: 3*10의6승, 3*10의6승float, 2*10의-3승
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		

	}

}
