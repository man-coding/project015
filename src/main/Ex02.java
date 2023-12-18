package main;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// Scanner 객체 생성
		// 표준입력을 인자로 사요(화면에서 입력을 받겠다는 뜻) ->
		Scanner scanner = new Scanner(System.in); // 스캐너 클래스는 혼자 쓸 수 없음.(부가기능을 사용하는 클래스. 그래서 인자로 표준입력장치를 받아야 함)

		// 문자열 입력받기
		System.out.println("이름: ");
		String name = scanner.nextLine();

		// 숫자 입력받기
		System.out.println("나이: ");
		int age = scanner.nextInt();

		System.out.println(name);
		System.out.println(age);

		// 사용한 리소스 닫기
		scanner.close();

	}

}