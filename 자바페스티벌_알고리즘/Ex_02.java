package 자바페스티벌;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int money = 0;
		for (int i = 1; i <= time; i++) {
			if(i<=8) {
			money += 5000;
			}else if(i>8) {
				money+=7500;
			}
		}
		System.out.print("총 임금은 " + money + "원 입니다.");
	}

}
