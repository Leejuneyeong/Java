
public class Ex_02 {

	public static void main(String[] args) {
		
		int orange = 3729;
		int number = 52;
		
		// 총 몇개의 박스가 필요한지 연산 작업
		
		int box = orange/number; //  몫	
		int box2 = orange%number; // 나머지
		
		System.out.println("필요한 박스의 수는 "+box+"개 입니다.");
		System.out.println("남은 오렌지의 수는 "+box2+"개 입니다.");
	
	}

}
