import java.util.Random;
import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		// �������� ����� ���� RandomŬ���� �ҷ�����
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// ������ 2�� �����ϱ� (1~20)
		int num1 = rd.nextInt(20) + 1;
		int num2 = rd.nextInt(20) + 1;

		System.out.println("==Plus Game==");

		// ���ڿ��� �ʱⰪ ���� = "";
		String ans = "";

		// �ݺ��� ����
		do {
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();

			// �Էµ� result�� �������� �ƴ��� �Ǵ�!
			if (num1 + num2 == result) {
				System.out.println("Success");

				// ���ο� ������ ���Ͽ� ������ �����!
				num1 = rd.nextInt(20) + 1;
				num2 = rd.nextInt(20) + 1;
			} else {
				System.out.println("Fail");
			}

			// �ݺ��� ���� Ȯ���ϱ�
			System.out.print("����Ͻðڽ��ϱ�? >> ");
			ans = sc.next();

		} // �ݺ��� ���� (do�� ���� ����)
		while (!ans.equals("N"));
		System.out.println("�����մϴ�.");
		// == / !=
		// .equals() / !����.equals()
	}
}