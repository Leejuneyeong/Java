package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_bonus05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int swap;
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("���� ��");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
