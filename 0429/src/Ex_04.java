import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0; // 짝수 개수 카운터
		int count1 = 0; // 홀수 개수 카운터

		while (true) {
			System.out.print("숫자입력 : ");
			int input = sc.nextInt();

			if (input != -1) {
				if (input % 2 == 0) {

					count++; // 짝수 개수 추가
					System.out.println("짝수개수 : " + count);
					System.out.println("홀수개수 : " + count1);

				} else {

					count1++; // 홀수 개수 추가
					System.out.println("짝수개수 : " + count);
					System.out.println("홀수개수 : " + count1);
				}
			}

			else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
