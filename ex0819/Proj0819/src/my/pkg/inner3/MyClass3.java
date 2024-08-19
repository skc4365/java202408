package my.pkg.inner3;


public class MyClass3 {

	public static void main(String[] args) {

//		오브젝트 생성부분 ***
		OuterClass3 myOuter = new OuterClass3();
		OuterClass3.InnerClass3 myInner = myOuter.new InnerClass3();
		System.out.println(myInner.myInnerMethod());
	}

}
