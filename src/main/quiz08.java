package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class quiz08 {

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\user\\Downloads");
		File[] files = dir.listFiles();

		try {
			FileOutputStream fos = new FileOutputStream("quiz08.txt"); // 한줄로 하려면 FileWriter 쓰면 됨.
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			for (File file : files) {
				osw.write(file.toString().substring(24));
				osw.write("\n");
			}
			osw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


////File dir = new File("C:\\Users\\imjiyeon\\Downloads");
//
//File dir = new File("e:\\Users\\205-T\\Downloads");
//File[] files = dir.listFiles(); // 폴더 밑에 있는 파일 목록
//
//FileWriter fw = new FileWriter("quiz8.txt");
//
//for (int i = 0; i < files.length; i++) {
//	File file = files[i];
//	String filename = file.getName();
//	fw.write(filename);
//	fw.write("\n");
//}
//
//fw.flush();