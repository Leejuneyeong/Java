package 자바페스티벌;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str + "(2)=");
		int a=Integer.parseInt(str,2);
		System.out.print(a+"(10)");
	}

}
