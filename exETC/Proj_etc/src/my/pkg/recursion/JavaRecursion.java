package my.pkg.recursion;

public class JavaRecursion {

	public static void main(String[] args) {

//		재귀함수: 재귀를 사용하여 5까지의 합을 표현해보자
//		5 + sum(4 + sum(3 + sum(2 + sum(1))))
		int result = sum(5);
		System.out.println("1~5까지의 합: " + result);
	}

	private static int sum(int cnt) {
//		재귀함수는 무한루프에 빠질 위험이 있으므로, 반드시 종료조건을 기술한다.
		if (cnt > 0)
			return cnt + sum(cnt - 1);
		else
			return 0;
	}

}
