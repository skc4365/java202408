package my.pkg.inner;

import my.pkg.inner.OuterClass.InnerClass;

public class MyClass {

	public static void main(String[] args) {

//		오브젝트 생성부분 ***
		OuterClass myOuter = new OuterClass();
		System.out.println(myOuter.x);
		
//		오브젝트 생성부분 ***
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myInner.x);

	}

}
