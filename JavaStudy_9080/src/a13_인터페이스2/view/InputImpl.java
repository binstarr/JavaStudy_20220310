package a13_인터페이스2.view;

import java.util.Scanner;

import a13_인터페이스2.model.User;

public class InputImpl implements Input{

	@Override
	public char typedSelect(Scanner scanner) {// 명령을 선택 입력후 해당 입력값 리턴
		System.out.print("명령어를 입력하세요.");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}
	@Override
	public User typedUser(Scanner scanner) {
		User user = new User();
		System.out.println("[회원가입]");
		System.out.println("회원아이디: ");
		user.setUsername(scanner.nextLine());
		System.out.println("회원비밀번호: ");
		user.setPassword(scanner.nextLine());
		System.out.println("회원이름: ");
		user.setName(scanner.nextLine());
		System.out.println("회원이메일: ");
		user.setEamil(scanner.nextLine());
		return user;
	}
	@Override
	public String typedUsername(Scanner scanner) {
		System.out.print("[아이디로 회원 조회]");
		System.out.print("[회원아이디:]");
		return scanner.nextLine();
	}
}
