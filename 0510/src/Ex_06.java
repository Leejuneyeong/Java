import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		getDivisor(sc.nextInt());

	}

	public static void getDivisor(int num) {
		System.out.print(num + "�� ��� : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
