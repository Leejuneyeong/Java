package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int money = 0;
		for (int i = 1; i <= time; i++) {
			if(i<=8) {
			money += 5000;
			}else if(i>8) {
				money+=7500;
			}
		}
		System.out.print("�� �ӱ��� " + money + "�� �Դϴ�.");
	}

}
