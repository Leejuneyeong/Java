
public class Ex_02 {

	public static void main(String[] args) {
		int num1 = -5;
		int num2 = -1;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
	}

	public static int close10(int num1, int num2) {

		int a = Math.abs(10 - num1);
		int b = Math.abs(10 - num2);

		if (a > b) {
			return num2;
		} else if (a < b) {
			return num1;
		} else {
			return 0;
		}
	}
}
