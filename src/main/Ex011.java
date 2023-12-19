package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex011 {

	public static void main(String[] args) {

		try {
			long start = 0;
			long end = 0;
			FileInputStream fis = new FileInputStream("a.txt"); // 입력 코드
			FileOutputStream fos = new FileOutputStream("copy.txt"); // 복사하는 코드

			// 복사를 시작하는 시간
			start = System.currentTimeMillis();
			System.out.println(start); // 현재시간 밀리세컨드단위

			while (true) {
				int i = fis.read();
				if (i == -1) {
					break;
				}
				fos.write(i);
			}

			end = System.currentTimeMillis(); // 현재시간(복사 후)
			System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
