package 자바페스티벌;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int result=0;
		for(int i=0;i<50;i++) {
			System.out.print(num1+"-"+num2+" ");
			result+=(num1-num2);
			num1+=2;
			num2+=2;
		}
		System.out.println();
		System.out.print("결과 : "+result);
		
	}

}
