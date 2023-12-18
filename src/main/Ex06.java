package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {

		try {
			// 파일 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream("output.txt");

			byte a = 65; // 65->A 문자로 변환되어 저장됨
			byte b = 66;

			fos.write(a); // 1바이트씩 파일에 저장
			fos.write(b);
			fos.write('c'); // 그대로 저장됨

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
