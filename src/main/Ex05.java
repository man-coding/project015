package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {

		// input3.txt 파일 만들고 A-Z 작성하기

		try {
			// 파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input3.txt");

			byte[] arr = new byte[10];

			int size;
			// 파일의 내용을 10 바이트씩 읽어오기
			while (true) {
				size = fis.read(arr);
				if (size == -1) {
					break;
				}
				// 읽어들인 크기만큼 배열요소를 출력
				for (int i = 0; i < size; i++) { // size 는 바이트의 크기임. 즉 10개씩 나눠서 출력하는 것임.
					System.out.print((char) arr[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
