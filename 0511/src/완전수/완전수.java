package 완전수;

import java.util.Scanner;

public class 완전수 {

	public static void main(String[] args) {
		/*
		 * int num1 = 10; int num2 =2;
		 * 
		 * boolean result = isDivide(num1,num2); System.out.println("결과 확인: "+result);
		 */

		int num = 10;
		int result = getSumOfDivisors(num);
		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		getDivisor(num);

		// 완전수
		// : 자기자신을 제외한 약수들의 합이 자기자신과 같은 수

		int num3 = 8196;
		boolean result2 = isPerfectNumber(num3);

		System.out.println("완전수 니? >> " + result2);
		// 완전수 니? >> true
		// 완전수 니? >> false
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	public static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void getDivisor(int num) {

		String result = "";
		result += num + "의 약수 : ";
		for (int i = 1; i <= num; i++) {

			if (isDivisor(num, i)) {
				result += i + " ";
			}

		}
		System.out.println(result + " ");
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean isPerfectNumber(int num3) {


		if ((getSumOfDivisors(num3) - num3) == num3) {
			return true;
		}

		return false;
	}
	
	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print("2~1000까지의 완전수 : ");
		for(int i=startValue;i<=endValue;i++) {
			if ((getSumOfDivisors(i) - i) == i) {
				System.out.print(i+" ");
			}
		}
	}
}