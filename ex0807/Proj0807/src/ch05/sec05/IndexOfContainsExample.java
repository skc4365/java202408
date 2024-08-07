package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";

//		indexOf(): 문자열의 인덱스 위치값을 돌려준다
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

//		substring(): 문자열의 위치값을 받아서 문자값을 돌려준다.
		String subString = subject.substring(location);
		System.out.println(subString);

		location = subject.indexOf("자바");
		
//		indexOf() 찾으려는 문자열이 없을때 -1값을 갖는다
		if(location != -1) 
			System.out.println("자바와 관련된 책이군요");
		else
			System.out.println("자바와 관련 없는 책이군요");


		boolean result = subject.contains("자바");
		if(result)
			System.out.println("자바와 관련된 책이군요");
		else
			System.out.println("자바와 관련 없는 책이군요");


	}

}
