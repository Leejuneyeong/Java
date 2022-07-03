
public class Ex_04 {

	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(1,2,3));
		
		System.out.println(7);
		System.out.println("문자");
	}
	
	// 같은 이름의 메소드가 매개변수가 서로 다른 갯수나, 형식으로 정의되어 있는기능
	// -> 메소드 오버로딩( 중복정의 )

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
