package a11_상속;

public class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뛰어다닙니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}