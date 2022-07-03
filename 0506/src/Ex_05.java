import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		int[] arr = { 1, 4, 3, 2, 1 };
		int score = 0;
		String[] word = new String[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번답>>");
			int input = sc.nextInt();
			if (arr[i] == input) {
				score += 20;
				word[i]="O";
			}
			else {
				word[i]="X";
			}
		}
		System.out.println("정답확인");

		for(int i=0;i<arr.length;i++) {
			System.out.print(word[i]+" ");
		}
		
		System.out.print("총점 : " + score);
	}
}
