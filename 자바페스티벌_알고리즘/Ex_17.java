package 자바페스티벌;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
		}

		System.out.print("결과 >> ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
