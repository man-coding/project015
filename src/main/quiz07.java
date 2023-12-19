package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class quiz07 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("output4.txt");

			OutputStreamWriter osw = new OutputStreamWriter(fos);

			osw.write("프로그래밍");

			osw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
