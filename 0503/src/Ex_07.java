import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		System.out.print(input+"�� ��� : ");
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
