
public class Ex_10 {

	public static void main(String[] args) {
		/*
		 * for (int i = 2; i <= 9; i++) { System.out.print(i + "´Ü : "); for (int j = 1;
		 * j <= 9; j++) { System.out.print(i + "*" + j + "=" + i * j + " "); }
		 * System.out.println(); }
		 */
		/*
		 * for(int i=1;i<=5;i++) { System.out.println(); for(int j=1;j<=i;j++) {
		 * System.out.print(j+" "); } }
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("@ ");
			}
			for (int z = 1; z <= i; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
