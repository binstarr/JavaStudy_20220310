package a08_함수;

public class MethodEx1 {

	public static int outputNumber() {
		return 10;
	}
	
	public static void showName() {
		String name = "강성빈";
		System.out.println("이름: 강성빈");
	}
	
	public static int outputNumber2(int number) {
		//int number = 100; 이렇게 해석 23번줄이 여기로옴
		return number;
	}
	
	public static int outputNumber3(int number) {
		if(number % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void showName2(String name) {
		System.out.println("테스트");
		if(name == null) {
			return;
		}
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		int number = outputNumber();
		System.out.println(number);
		showName();
		if(number == 10) {
			return;
		}
		showName2(null);
		int number2 = outputNumber2(100);
		System.out.println(number2);
	}

}
