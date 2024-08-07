package ch05sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		int[] intArray = null;
//---NullPointerException:		
//		intArray[0] = 10;

		String str = null;
//---NullPointerException:
		System.out.println(str.length());

	}

}
