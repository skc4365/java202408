package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {

//		i행과 j열을 가지는 2차원 배열로 구구단 작성하기
		for (int i=2; i<=9; i++) {
			System.out.println("-----" + i + "단 -----");
			
			for (int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
	}

}

















