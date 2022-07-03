
public class Ex_01 {

	public static void main(String[] args) {
		
		String a = 10+7+""; // 왼쪽에서 오른쪽으로 진행하니까 17나옴
		String b = 8+""+2;
		String c = ""+5+2;  // "" 문자니까 ""5가 되고 52가 됨
		
		//숫자 + 숫자 = 숫자
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자 or 문자+숫자 = 문자
		
		
		System.out.println("a의 결과값 : " + a);
		System.out.println("b의 결과값 : " + b);
		System.out.println("c의 결과값 : " + c);
		
	}

}
