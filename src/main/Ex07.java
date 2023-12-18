package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("output2.txt");

			byte[] arr = {90, 69, 67 };

			// 배열의 모든 데이터 출력 // 데이터를 한번에 출력할 때에는 배열을 활용하면 된다.
			fos.write(arr);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
