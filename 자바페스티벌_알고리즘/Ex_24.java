package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� >> ");
		int ninput = sc.nextInt();
		System.out.print("X �Է� >> ");
		int xinput = sc.nextInt();

		int[] arr = new int[ninput];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� >> ");
			arr[i] = sc.nextInt();
		}

		System.out.print("��� >> ");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < xinput) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
