package �ڹ��佺Ƽ��;

import java.util.Random;

public class Ex_18 {

	public static void main(String[] args) {
		Random rc = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rc.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.println("����� ��ȣ : "+lotto[i]);
		}
	}

}
