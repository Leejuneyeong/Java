package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��������� : ");
		int now = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();

		int count = 1;

		System.out.print(count + "���� ���� ������ : ");

		int num = sc.nextInt();

		int sub = now - num;

		do {
			count++;
			System.out.print(count + "���� ���� ������ : ");
			num = sc.nextInt();
			sub = sub - num;

		} while (sub >= goal);
		System.out.println(sub + "kg �޼�!! �����մϴ�!");

	}
}
