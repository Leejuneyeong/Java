package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[26];
		System.out.println("====���ĺ� �󵵼� ���ϱ�====");
		System.out.print("�Է� >> ");
		String str = sc.nextLine();
		str = str.replace(" ", "").toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			alphabet[ch-'a']++; // �ƽ�Ű�ڵ� ���� �ҹ��� a:97 ~ z : 122
		}
		// �빮�� A:65~Z:90
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (97 + i) + ":" + alphabet[i]);
		}
	}

}
