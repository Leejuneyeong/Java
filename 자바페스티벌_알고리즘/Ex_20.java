package 자바페스티벌;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		System.out.print("숫자 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int num = sc.nextInt();
		int i = 0;
		while (num != 0) {
			array[i] = num % 2;
			num = num / 2;
			i++;
		}
		for (int j = array.length - 1; j >= 0; j--) 
			System.out.print(array[j]);
	}

}
