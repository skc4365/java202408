package ch03.sec04;

public class AccuracyExam {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
//		몇조각남았는지 = 사과1개 - (7조각 * 0.1) = 0.29999999999999993
		double result = apple - number * pieceUnit;
		System.out.println("사고 1개에서 남은양: " + result);
	}

}
