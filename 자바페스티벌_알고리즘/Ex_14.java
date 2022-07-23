package 자바페스티벌;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0) {
					System.out.print((i + 1) + j + " ");
				} else if (i == 1) {
					System.out.print((i + 9) - j + " ");
				} else if (i == 2) {
					System.out.print((i + 9) + j + " ");
				} else if (i == 3) {
					System.out.print((i + 17) - j + " ");
				} else {
					System.out.print((i + 17) + j + " ");
				}
			}
			System.out.println();
		}
	}

}
