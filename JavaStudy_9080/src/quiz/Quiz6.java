package quiz;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				int n = 0;
		
		System.out.print("반복 횟수 입력:");
		n = scanner.nextInt();
		
		for(int i = 0; i< n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j< n - i; j++) {
			System.out.print("*");
	
			}
			System.out.println();
		}
	}

}
