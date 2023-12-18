package main;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] intArr = new int[5];

//		intArr[0] = sc.nextInt();
//		intArr[1] = sc.nextInt();
//		intArr[2] = sc.nextInt();
//		intArr[3] = sc.nextInt();
//		intArr[4] = sc.nextInt();
//
//		int sum = intArr[0] + intArr[1] + intArr[2] + intArr[3] + intArr[4];
//		System.out.println(sum);

		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}
		System.out.println(sum);
	}

}
