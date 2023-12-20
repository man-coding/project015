package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class quiz010 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("quiz010.txt");
		String path1 = "C:\\Kimminsu\\workspace\\Project2\\src";

		FileList(path1, fw);

	}

	public static void FileList(String path, FileWriter fw) throws IOException {

		File dir = new File(path);
		File[] list = dir.listFiles();

		for (int i = 0; i < list.length; i++) {
			File file = list[i]; // 재귀함수 전에 for문에 미리 저장해야 상위폴더도 출력됨.
			fw.write(file.getName());

			if (file.isFile()) {
				fw.flush();
				fw.write("\n");
			} else if (file.isDirectory()) {
				FileList(list[i].getPath(), fw);
			}

		}

	}
}
