
public class Ex_05 {

	public static void main(String[] args) {

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
		System.out.println("결과 확인 : " + powerN(3, 3));
		System.out.println("결과 확인 : " + powerN(10, 2));
		System.out.println("===========================");
		getDivisor(10);
		System.out.println();
		getDivisor(16);
		System.out.println();
		getDivisor(24);
	}

	public static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= base;
		}
		return result;
	}

	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
