package 자바페스티벌;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String str = sc.next();
		word(str);
	}
	
	public static void word(String str) {
		String s = str;
		int sum=0;
		char[] arr = new char[s.length()];
		int[] arr2= new int[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++) {
			arr2[i]=Character.getNumericValue(arr[i]);
		}
		
		for(int i=0;i<s.length();i++) {
			sum+=arr2[i];
		}
		System.out.print(sum);
	}

}
