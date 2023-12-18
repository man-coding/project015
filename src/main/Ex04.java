package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {

		try {
			// 텍스트 파일과 연결된 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input2.txt");
			// 파일의 내용을 읽다가 파일의 끝에 도달하면 반복문 종료
			while (true) {

				int i = fis.read();

				// 파일의 끝에 도달하면 -1을 반환
				if (i == -1) {
					break;
				}
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
