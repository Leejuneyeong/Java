import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {

		// ����ڷκ��� �ΰ��� ������ �Է� �޾�
		// �ش��ϴ� ������ ���ϱ� ���� �ϴ� �޼ҵ带 ����� ����!

		// 1. �� ���� ���� �Է¹ޱ�

		// 2. addNum() �Լ��� �Ű����� ������ �Է� ���� ���� �����ϱ�

		// 3. addNum() �޼ҵ带 ����!
		// - �ΰ��� ������ ���Ͽ� ���ϱ� ������ �����ϰ�
		// - �޼ҵ带 ȣ���� ������ ����� �����ϱ�!

		// ���ʽ� ����
		// - ������ �Է� �ޱ�
		// - �ش��ϴ� �����ڸ� ó���� �� �� �ִ� �޼ҵ� �����
		// + -> addNum()
		// - -> divNum()
		// *
		// /

		// ������ ���꿡 ���� �޼ҵ� ����!
		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� ���� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է��ϼ��� : ");

		String op = sc.next();

		switch (op) {
		case "+":
			System.out.println("���ϱ� ��� : " + addNum(num1, num2));
			break;
		case "-":
			System.out.println("���� ��� : " + subNum(num1, num2));
			break;
		case "*":
			System.out.println("���ϱ� ��� : " + mulNum(num1, num2));
			break;
		case "/":
			System.out.println("������ ��� : " + divNum(num1, num2));
			break;
		default:
		}
	}

	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int subNum(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public static int mulNum(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public static int divNum(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}

}
