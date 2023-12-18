package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		try {
			// 텍스트파일과 연결된 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input.txt");

			int i = fis.read();

			System.out.println((char) i); // 문자로 출력하려면 char로 형변환해야 함.

			System.out.println(fis.read()); // 66

			System.out.println((char) fis.read()); // c

			System.out.println(fis.read()); // -1   파일의 끝은 "-1"
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
