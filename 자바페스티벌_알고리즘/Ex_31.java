package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		int result=1;
		for(int i=input;i>0;i--) {
			result=result*i;
		}
		System.out.print("��� : "+result);
	}

}
