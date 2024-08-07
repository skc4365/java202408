package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
//		문자열 대체 함수 replace()
		String newStr = oldStr.replace("자바", "JAVA");
		String str = oldStr.replace("문자열", "STRING");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(str);

	}

}
