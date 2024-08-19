package my.pkg.interf;

public class PetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet;
		pet = new Dog();
		pet.animal("초코", "개", "노랑");
		pet.sound();
		pet.setMute(pet.name=="초코" && pet.kind=="개");
		
		pet = new Dog();
		pet.animal("또리", "개", "검정");
		pet.sound();
		pet.setMute(pet.name=="초코" && pet.kind=="개");
		
		pet = new Snake();
		pet.animal("초코", "뱀", "갈색");
		pet.sound();
		pet.setMute(pet.name=="초코" && pet.kind=="개");
	}
}
