package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		String input1 = sc.next();
		System.out.print("�� ��° ���� �Է� >> ");
		String input2 = sc.next();
		
		String[] str2 = input2.split("");

		for(int i=str2.length-1;i>=0;i--) {
			System.out.println(Integer.parseInt(str2[i])*Integer.parseInt(input1));	
		}
		int result=Integer.parseInt(input2)*Integer.parseInt(input1);
		System.out.println(result);
	}

}
