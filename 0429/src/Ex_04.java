import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0; // ¦�� ���� ī����
		int count1 = 0; // Ȧ�� ���� ī����

		while (true) {
			System.out.print("�����Է� : ");
			int input = sc.nextInt();

			if (input != -1) {
				if (input % 2 == 0) {

					count++; // ¦�� ���� �߰�
					System.out.println("¦������ : " + count);
					System.out.println("Ȧ������ : " + count1);

				} else {

					count1++; // Ȧ�� ���� �߰�
					System.out.println("¦������ : " + count);
					System.out.println("Ȧ������ : " + count1);
				}
			}

			else {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}

}
