package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("====== ä���ϱ� ======");

		String answ = "oooxoo";

		int score = 0;
		int count = 1;

		for (int i = 0; i < answ.length(); i++) {
			if (answ.charAt(i) == 'o') {
				score += count;
				count++;
			} else {
				score += 0;
				count = 1;
			}
		}
		System.out.println(score);
	}

}
