package 자바페스티벌;

public class Ex_22 {

	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5 - a; b++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= a; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
                      *
                   * *
                * * *
             * * * *
           * * * * *