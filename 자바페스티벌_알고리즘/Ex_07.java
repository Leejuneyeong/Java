package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int input = sc.nextInt();
		for(int i=0;i<input;i++) {
			for(int j=input;j>i;j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
