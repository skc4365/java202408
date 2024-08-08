package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];

		//----- 배열 항목 복사 -----
		//	  .arraycopy( old배열을 복사해서 0위치, new배열에 복사해준다. 0위치 , length만큼);
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		//		{"array", "copy" } 3개복사해아
		//		System.arraycopy( oldStrArray, 1, newStrArray, 0, oldStrArray.length-1);

		//배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}

