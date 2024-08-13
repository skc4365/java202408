package ch08.sec13;

public class ImplClass implements InterfaceC {
	
//	( 상속: A <- B <- C) ***모두 상속받은 인터페이스를 구현.
	
	public void methodA() {
		System.out.println("methodA() 실행");
	}	
	
	public void methodB() {
		System.out.println("methodB() 실행");
	}
	
	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
}
