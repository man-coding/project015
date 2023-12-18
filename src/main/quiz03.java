package main;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			String str = sc.nextLine();

			if (str.toUpperCase().equals("STOP")) { // == 연산자로 비교하면 주소값을 비교하므로 결과가 안 나옴.
				break;
			} // equalsIgnoreCase("stop") 써도 됨.

		}
		System.out.println("시스템이 종료되었습니다.");
	}

}
