package ch08.sec13;

public sealed interface InterfaceA permits InterfaceB {

	//***	InterfaceA의 자식인터페이스는 InterfaceB만 가능하다

	void methodA();
}
