package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {

		String board = "1, 자바 학습, 참조 타입 String을 학습합니다., 홍길동";

		//		,를 기준으로 문자열을 분리해서 배열에 담는다
		String[] tokens = board.split(",");

		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println("-------------------------");

		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		System.out.println("-------------------------");

		//--- title배열을 사용하여 이쁘게 만들어보자
		String[] title = {"번호", "제목", "내용", "성명"};

		for(int i=0; i<tokens.length; i++) {
			System.out.println(title[i] + ": " + tokens[i]);
		}

	}

}









