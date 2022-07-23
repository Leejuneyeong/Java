package 자바페스티벌;

import java.util.Random;
import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rc = new Random();
		int count = 0;
		while (true) {
			int num1 = rc.nextInt(10);
			int num2 = rc.nextInt(10);
			int sum = num1 + num2;
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();
			if (result == sum) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				count++;
				if (count == 5) {
					System.out.println("GAME OVER!");
					break;
				}
			}

		}
	}

}
