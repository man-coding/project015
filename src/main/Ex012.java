package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex012 {

	public static void main(String[] args) {

		try {
			long start = 0;
			long end = 0;

			// 입출력 스트림 생성
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("copy2.txt");

			// 버퍼링 보조스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			// 복사 시간 측정하기
			start = System.currentTimeMillis();

			// 8kb를 한꺼번에 읽어서 복사하는 중

			while (true) {
				int i = bis.read(); // 참조변수를 꼭 보조스트림을 써야 한다.
				if (i == -1) {
					break;
				}
				bos.write(i); // 참조변수를 꼭 보조스트림을 써야 한다.
			}
			end = System.currentTimeMillis();

			System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다."); // 보조스트림을 써서 8kb씩 읽어서 훨씬 빠르다

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
