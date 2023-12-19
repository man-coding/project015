package main;

import java.awt.desktop.PrintFilesEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class quiz09 {

	public static void main(String[] args) throws IOException {

		String filepath1 = "C:\\Users\\user\\Downloads";
		String filepath2 = "C:\\장지연\\에팩";

		FileWriter fw = new FileWriter("quiz09.txt");

		printFileList(filepath1, fw);

	}

	public static void printFileList(String filepath, FileWriter fw) throws IOException {

		File dir = new File(filepath);

		File[] files = dir.listFiles(); // 폴더 밑에 있는 파일 목록

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String filename = file.getName();
			fw.write(filename);
			fw.write("\n");
		}

		fw.flush();
	}
}
