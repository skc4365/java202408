package ch02.sec06;

public class StringExam {

	public static void main(String[] args) {

		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
//		"그대로 출력하는 방법: \"
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);

//		tab효과: \t
		str = "번호\t이름\t직업";
		System.out.println(str);

//		개행(엔터를 친 효과): \n
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");

	}

}
