package 자바페스티벌;

import java.util.Scanner;

public class Ex_bonus04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0;i<num.length;i++) {
			System.out.print((i+1)+"번째 별의 수 : ");
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+":");
			for(int j=0;j<num[i];j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
