
public class Ex_04 {

	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(1,2,3));
		
		System.out.println(7);
		System.out.println("����");
	}
	
	// ���� �̸��� �޼ҵ尡 �Ű������� ���� �ٸ� ������, �������� ���ǵǾ� �ִ±��
	// -> �޼ҵ� �����ε�( �ߺ����� )

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
}
