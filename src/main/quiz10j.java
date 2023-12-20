package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class quiz10j {

	public static void main(String[] args) throws IOException {
		// 폴더 경로
		String filepath = "C:\\Kimminsu\\workspace\\Project2";

		// 출력 스트림
		FileWriter fw = new FileWriter("quiz010.txt");

		// 메소드 호출
		printFileList(filepath, fw, 0);

	}

	// 폴더에 포함된 파일 목록을 출력하는 메소드
	// 매개변수: 폴더경로, 출력 스트림
	public static void printFileList(String filepath, FileWriter fw, int level) throws IOException {

		File dir = new File(filepath);

		// 폴더 밑에 있는 파일 목록 꺼내기
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) { // 이 포문 1개의 코드가 딱 1개의 파일명을 출력함.

			// 배열에서 파일 꺼내기
			File file = files[i];

			// 디렉토리 여부 확인
			boolean isDirectory = file.isDirectory();

			// 파일 이름 꺼내기
			String filename = file.getName();

			StringBuilder builder = new StringBuilder();

			// 들여쓰기로 계층구조 표시
			for (int j = 0; j < level; j++) {
				builder.append("\t"); // 딱 1개의 파일에 띄어쓰기 함.(레벨에 따라 띄어쓰기 횟수가 늘어남)
			}

			builder.append(filename); // 포문 밖에 써야 됨. 띄어쓰기 횟수를 정하고 한번에 출력.

			// 파일 이름 출력
			fw.write(builder.toString());

			if (isDirectory) { // 해당 파일이 폴더라면
				fw.write("\n");
				String subfilepath = file.getPath();
				printFileList(subfilepath, fw, level + 1); // 자기 자신을 호출하는 재귀함수
			}

			fw.write("\n");
		}
		fw.flush();
	}
}