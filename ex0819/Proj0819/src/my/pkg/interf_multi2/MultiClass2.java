package my.pkg.interf_multi2;

public class MultiClass2 implements SecondInterf2 {

	@Override
	public void method2() {
		System.out.println("두번째 인터페이스 222");
	}

	@Override
	public void method1() {
		System.out.println("첫번째 인터페이스 111");
	}

	@Override
	public void method_basic() {
		System.out.println("기본 인터페이스 000");
	}

}
