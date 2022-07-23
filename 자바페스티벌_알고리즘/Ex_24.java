package 자바페스티벌;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int ninput = sc.nextInt();
		System.out.print("X 입력 >> ");
		int xinput = sc.nextInt();

		int[] arr = new int[ninput];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
		}

		System.out.print("결과 >> ");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < xinput) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
