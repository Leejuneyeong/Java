import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		// 1. �� ���� ���� �Է¹ޱ�(int)
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� >> ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է� >> ");
		int num2 = sc.nextInt();

		// 2. ������ �Է� �ޱ�(String)

		System.out.print("������ �Է�(+,-,*,/) >> ");
		String op = sc.next();

		// 3. ���꿡 ���� ���� �ٸ� �޼ҵ带 ȣ���� �� �ֵ��� �����
		// - �޼ҵ� ���� �۾� �����ϱ�
		// - �� �޼ҵ忡 ���� �۾�ó�� �ۼ��ϱ�

		// �޼ҵ��� ������� ���� �� �ִ� ���� ����!

		int result = 0;

		if (op.equals("+")) {
			// ���ϱ⿡ ���õ� �޼ҵ� ȣ��!
			result = add(num1, num2);
		} else if (op.equals("-")) {
			// ���⿡ ���õ� �޼ҵ�
			result = sub(num1, num2);
		} else if (op.equals("*")) {
			// ���ϱ�
			result = mul(num1, num2);
		} else {
			// ������(��)
			result = div(num1, num2);
		}
		System.out.println("����� : " + result);
	}

	// �Ű����� : �Լ������� ����� ������ ���� -> x�� -> ��ᰪ / �Է°�
	public static int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int sub(int num1, int num2) {

		return num1 > num2 ? num1 - num2 : num2 - num1;
		// ���׿����� = ���� ? �� : ����
	}

	public static int mul(int num1, int num2) {

		return num1 * num2;
	}

	public static int div(int num1, int num2) {

		if (num1 == 0 && num2 == 0) {
			return 0;
		}
		
		return num1 > num2 ? num1 / num2 : num2 / num1;
		// ���׿����� = ���� ? �� : ����
	}

}
