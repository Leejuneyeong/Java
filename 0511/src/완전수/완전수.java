package ������;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		/*
		 * int num1 = 10; int num2 =2;
		 * 
		 * boolean result = isDivide(num1,num2); System.out.println("��� Ȯ��: "+result);
		 */

		int num = 10;
		int result = getSumOfDivisors(num);
		System.out.println(num + "�� ����� �� : " + result);
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		getDivisor(num);

		// ������
		// : �ڱ��ڽ��� ������ ������� ���� �ڱ��ڽŰ� ���� ��

		int num3 = 8196;
		boolean result2 = isPerfectNumber(num3);

		System.out.println("������ ��? >> " + result2);
		// ������ ��? >> true
		// ������ ��? >> false
		
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
		result += num + "�� ��� : ";
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
		System.out.print("2~1000������ ������ : ");
		for(int i=startValue;i<=endValue;i++) {
			if ((getSumOfDivisors(i) - i) == i) {
				System.out.print(i+" ");
			}
		}
	}
}