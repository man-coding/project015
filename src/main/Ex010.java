package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex010 {

	public static void main(String[] args) {

		// 기반스트림 생성
		FileInputStream fis;
		try {
			fis = new FileInputStream("reader.txt");

			// 보조스트림 생성 (문자로 받아오기 위해)
			InputStreamReader isr = new InputStreamReader(fis); // 인자로 기반스트림을 받음

			// 보조스트림으로 파일 내용 읽기
			while (true) {
				int i = isr.read(); // 바이트 읽은 내용을 문자로 변환하여 저장
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 한글 제대로 읽음
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
