package ch05sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		
//		int타입의 값이 들어갈 배열Array을 만들겠다.
		int[] arr1;
		int[] arr2;
		int[] arr3;

//		arr1의 주소값을 가지게 된다.
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;

//		각자 new로 생성되어서 다른 배열이다.
		System.out.println(arr1 == arr2);
		
//		배열값이 같다 arr1[0] = {1}, arr2[0] = {1}
		System.out.println(arr1[0] == arr2[0]);
		
//		arr3배열은 arr2의 주소값을 사용하므로 같은 배열이다.
		System.out.println(arr2 == arr3);
	}

}
