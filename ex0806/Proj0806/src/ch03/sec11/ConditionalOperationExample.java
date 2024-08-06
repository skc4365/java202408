package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 85;
		
//		기본 if...else if..else을 사용한 방법
		char grade0 = ' ';
		if(score > 90) {
			grade0 = 'A';
		}else if(score > 80){
			grade0 = 'B';
		}else {
			grade0 = 'C';
		}
		System.out.println(score + "점은 " + grade0 + "등급입니다.");
		
//		삼항연산자를 사용한 방법
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
