package ch03.sec03;

public class OverflowUnderflowExam {

	public static void main(String[] args) {
		
//		오버플로우 발생시(허용범위 최소값을 적용)
		byte var1 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println(); 
			System.out.println("var1: " + var1);
		}
		System.out.println("-------------------");

//		언더플로우 발생시(허용범위 최대값을 적용)
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--; 
			System.out.println();
			System.out.println("var2: " + var2);
		}
		
	}

}
