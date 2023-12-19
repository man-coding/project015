package main;

import java.io.FileWriter;
import java.io.IOException;

public class quiz05 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("writer2.txt");
			int i = 1;
			while (i <= 10) {
				if (i % 2 == 0) {
					fw.write(i + " "); // i를 그대로 입력하면 아스키코드가 입력됨.
				}
				i++;
			}
			fw.flush();  //강제로 내보내줌 중요!!!!!flush

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
