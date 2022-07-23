package 자바페스티벌;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			int result = ((i*i)-i+2)/2;
			System.out.print(result+" ");
		}
	}

}
