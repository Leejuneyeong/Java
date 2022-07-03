import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			if (input > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
