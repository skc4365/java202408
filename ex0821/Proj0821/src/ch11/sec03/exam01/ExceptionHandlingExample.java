package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {		
			try {
				
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				
//				i<=array.length ==>> array[2]는 없어서, 인덱스값 초과
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) {
				
//				"1oo" 숫자가 아님 Integer.parseInt(array[i]) 숫자변환에서 오류남
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			}
		}
	}
}
