package 자바페스티벌;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 :");
		int input = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int result = input*i;
			System.out.println(input+"*"+i+"="+result);
		}
	}

}
