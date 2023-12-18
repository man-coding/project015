package main;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("안녕하세요");

		System.out.println("알파벳 하나를 쓰고 [enter]를 누르세요");

		try {
			int i = System.in.read();
			System.out.println(i); // a->97
			System.out.println((char) i); // 형변환 필요 (문자로 사용시)

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
