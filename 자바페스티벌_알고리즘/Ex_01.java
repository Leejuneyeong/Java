package 자바페스티벌;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();

		int count = 1;

		System.out.print(count + "주차 감량 몸무게 : ");

		int num = sc.nextInt();

		int sub = now - num;

		do {
			count++;
			System.out.print(count + "주차 감량 몸무게 : ");
			num = sc.nextInt();
			sub = sub - num;

		} while (sub >= goal);
		System.out.println(sub + "kg 달성!! 축하합니다!");

	}
}
