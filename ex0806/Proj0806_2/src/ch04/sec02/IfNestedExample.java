package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {

		double randomNum = Math.random();
		int score = (int)(randomNum * 20) + 81;
		System.out.println("점수: " + score);

		String grade;
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {	
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점: " + grade);
		System.out.println("랜덤넘버는: " + randomNum);
	}
}


