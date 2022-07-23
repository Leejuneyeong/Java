package 자바페스티벌;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력: ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print((i+1)+(5*j)+" ");
			}
			System.out.println();
		}

	}

}
