package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ��Է� :");
		int input = sc.nextInt();
		System.out.println("��� ������ ��� : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int result = input*i;
			System.out.println(input+"*"+i+"="+result);
		}
	}

}
