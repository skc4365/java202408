package ch03.sec09;

public class MyBit {

	public static void main(String[] args) {
		
//		진수변환 ---- 10진수 => 2진수, 8진수, 16진수
		int num = 10;
		String num_2 = Integer.toBinaryString(num);
		String num_8 = Integer.toOctalString(num);
		String num_16 = Integer.toHexString(num);
		System.out.println("10진수: " + num);
		System.out.println("2진수: " + num_2);
		System.out.println("8진수: " + num_8);
		System.out.println("16진수: " + num_16);
		
//		진수변환 ---- 2진수, 8진수, 16진수 => 10진수 
		int num_10_2 = Integer.parseInt("1010", 2);
		int num_10_8 = Integer.parseInt("12", 8);
		int num_10_16 = Integer.parseInt("A", 16);
		System.out.println("2진수:1010 = " + num_10_2);
		System.out.println("8진수:12 = " + num_10_8);
		System.out.println("16진수:A = " + num_10_16);
	}

}
