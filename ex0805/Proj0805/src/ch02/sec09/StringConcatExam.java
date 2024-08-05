package ch02.sec09;

public class StringConcatExam {

	public static void main(String[] args) {
		
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);
		
//		12 + "8" = 128
		String result2 = 10 + 2 + "8";
		System.out.println("result2: " + result2);
		
//		10 + "2" = "12" + 8 = "128" 
		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);
		
//		"10" + 2 = "12" + 8 = "128"
		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4);
		
//		"10" + (10) ="1010"
		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);
	}

}
