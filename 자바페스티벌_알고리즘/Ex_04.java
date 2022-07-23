package ÀÚ¹ÙÆä½ºÆ¼¹ú;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ÃÑ ±Ý¾× ÀÔ·Â :  ");
		int money = sc.nextInt();

	    System.out.println("ÀÜµ· :"+money);
	    //25600
	    int monwon=0;
	    int ochenwon=0;
	    int chenwon=0;
	    int obackwon=0;
	    int backwon=0;
	   	    
	    monwon = money/10000;
	    money=money-(money/10000)*10000;
	    
	    System.out.println("10000¿ø : "+monwon);
	    
	    ochenwon = money/5000;
	    money=money-(money/5000)*5000;
	    
	    System.out.println("5000¿ø : "+ochenwon);
	    
	    chenwon = money/1000;
	    money=money-(money/1000)*1000;
	    
	    System.out.println("1000¿ø : "+chenwon);

	    
	    obackwon = money/500;
	    money=money-(money/500)*500;
	    
	    System.out.println("500¿ø : "+obackwon);

	    
	    backwon = money/100;
	    money=money-(money/100)*100;
	    
	    System.out.println("100¿ø : "+backwon);


	}

}
