import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� �Է� : ");
			int input = sc.nextInt();
			if (input > 10) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}
}
