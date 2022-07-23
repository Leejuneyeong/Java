package 자바페스티벌;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[26];
		System.out.println("====알파벳 빈도수 구하기====");
		System.out.print("입력 >> ");
		String str = sc.nextLine();
		str = str.replace(" ", "").toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			alphabet[ch-'a']++; // 아스키코드 영어 소문자 a:97 ~ z : 122
		}
		// 대문자 A:65~Z:90
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (97 + i) + ":" + alphabet[i]);
		}
	}

}
