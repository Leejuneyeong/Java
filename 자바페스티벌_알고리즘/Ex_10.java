package �ڹ��佺Ƽ��;

import java.util.Random;

public class Ex_10 {

	public static void main(String[] args) {
		Random rc = new Random();
		int[] num = new int[8];
		int max = 0;
		System.out.print("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = rc.nextInt(100) + 1;
			System.out.print(num[i] + " ");
		}
		
		int min = num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (max < num[i]) {
				max = num[i];
			}
			else if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
	}

}
