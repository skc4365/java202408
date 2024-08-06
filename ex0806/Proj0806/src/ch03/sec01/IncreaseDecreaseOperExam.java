package ch03.sec01;

public class IncreaseDecreaseOperExam {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x=10
		     // x=11
		++x; // x=12
		System.out.println("X = " + x);
		System.out.println("--------------------");
		
		y--; // y=10
		     // y=9
		--y; // y=8
		System.out.println("Y = " + y);
		System.out.println("--------------------");
		
		z = x++; // z = x
		         // x=13, z=12
		System.out.println("Z = " + z);
		System.out.println("X = " + x);
		System.out.println("--------------------");
		
		z = ++x; // x=14, z=14
		System.out.println("Z = " + z);
		System.out.println("X = " + x);
		System.out.println("--------------------");
		
		z = ++x + y++; // z= 15(x) + 8 = 23
		               // y=9
		System.out.println("Z = " + z);
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}
