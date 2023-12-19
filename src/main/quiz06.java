package main;

import java.io.FileWriter;
import java.io.IOException;

public class quiz06 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("writer3.txt");

			for (int i = 2; i <= 9; i++) {
				fw.write(i + "단: ");
				for (int j = 1; j <= 9; j++) {
					fw.write(i * j + " ");

				}
				fw.write("\n");
			}
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}

}
