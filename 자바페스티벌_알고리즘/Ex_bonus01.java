package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_bonus01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A �Է� : ");
			int a = sc.nextInt();
			System.out.print("B �Է� : ");
			int b = sc.nextInt();
			int sub = a - b;

			if (a == 0 && b == 0) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("��� >> " + sub);
			}

		}

	}

}
