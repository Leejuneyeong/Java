package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String str =sc.next();

		String[] s = str.split("");

		int count = 0;
		for(int i=0;i<s.length;i++) {
			if(s[i].equals("1")) {
				count=count+2;
			}else if(s[i].equals("2")) {
				count=count+5;
			}else if(s[i].equals("3")) {
				count=count+5;
			}else if(s[i].equals("4")) {
				count=count+4;
			}else if(s[i].equals("5")) {
				count=count+5;
			}else if(s[i].equals("6")) {
				count=count+6;
			}else if(s[i].equals("7")) {
				count=count+3;
			}else if(s[i].equals("8")) {
				count=count+7;
			}else if(s[i].equals("9")) {
				count=count+6;
			}else if(s[i].equals("0")) {
				count=count+6;
			}
		}
		System.out.print("���('-')�� ���� >> "+count);
	}

}
