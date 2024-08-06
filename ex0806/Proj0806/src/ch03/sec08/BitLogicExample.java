package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		
//		1:0001, 2:0010, 3:0011, 4:0100, 5:0101, 6:0110, 7:0111, 8:1000, 9:1001, 10:1010
		
//		45:00101101
//		25:00011001
//		-----------
//		   00001001 비트AND연산  &
//		   00111101 비트OR연산   |
//		   00110100 비트Ex~OR연산   ^ **서로 다를때 참
//		   11010010 비트NOT연산   ~ **반대
		
//		3:0011
//		5:0101
//		--------
//		  0001    &  = 1
//		  0111    |  = 7
//		  0110    ^  = 6
//		  1010    ~  = 부호부를 적용 =-6
		
		System.out.println("3 & 5 = " + (3 & 5)); //
		System.out.println("3 | 5 = " + (3 | 5));
		System.out.println("3 & 5 = " + (3 ^ 5));
		System.out.println("~5 = " + (~5));
		System.out.println("-------------------------------");
		System.out.println("45 & 25 = " + (45 & 25));		
		System.out.println("45 | 25 = " + (45 | 25));	
		System.out.println("45 ^ 25 = " + (45 ^ 25));	
		System.out.println("~45 = " + (~45));		
		System.out.println("-------------------------------");
		
		byte receiveData = -120;
		
		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 =  receiveData & 255;
		System.out.println(unsignedInt1);

		//방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
