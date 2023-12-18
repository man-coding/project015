package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class quiz04 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("output3.txt");

			byte[] arr = new byte[26];
			byte data = 65;

			for (int i = 0; i <= 25; i++) {
				arr[i] = data; // 배열에 전부 넣는다.
				data++;
			}
			fos.write(arr); // 배열을 출력
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
