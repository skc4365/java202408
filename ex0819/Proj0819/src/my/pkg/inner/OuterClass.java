package my.pkg.inner;

public class OuterClass {
	public int x = 65;
	
// 프라이빗클래스
//	private class InnerClass {
//		public int y;
//		public int x;
//	}
	
//	디폴트클래스(패키지 안에서만 접근가능)
//	class InnerClass {
//
//		public int y;
//		public int x;
//	}
	
//	퍼블릭클래스(프로젝트 전체에서 접근가능)
	public class InnerClass {

		public int y;
		public int x;
	}

}
