package ch07.sec08.exam02;

public class Driver {
	
//	*** 수퍼클래스를 매겨변수로 사용하므로 인해서,
//	하위클래스가 추가될때마다 작성해줘야하는 번거로움이 없어진다. *** 
	
	//메소드 선언(클래스 타입의 매개변수를 가지고 있음)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
//	원래 두개가 필요한 매소드
//	public void drive(Bus bus) {
//		bus.run();
//	}
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
//	오토바이가 추가되면 또!! 작성해줘야한다.
//	자전거가 추가되면 또!! 작성해줘야한다.
//	전기스쿠터가 추가되면 또!! 작성해줘야한다.
	

}
