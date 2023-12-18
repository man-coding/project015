package main;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		int result = i % 10 + i / 10;
		System.out.println(result);
	}

}
