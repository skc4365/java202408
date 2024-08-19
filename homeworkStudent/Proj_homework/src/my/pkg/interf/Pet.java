package my.pkg.interf;

public interface Pet {
//	필드 선언
	String name = "";
	String kind = "";
	String color = "";
	
	void animal(String name, String kind, String color);
	void sound();
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
	}
}
