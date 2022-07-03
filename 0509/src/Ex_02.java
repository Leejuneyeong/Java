
public class Ex_02 {

	// main 메소드
	public static void main(String[] args) {

		// 두개의 정수를 활용하여 더하기 연산을 진행하는 메소드 호출하기!
		int total = addNum(3, 4);
		System.out.println("결과 값 : " + total);
		
		int total2 = addNum(10,2);
		System.out.println("결과 값 : "+ total2);

	}
	// 메소드 기본 구조
	// 1. 접근 제한자 ( = 접근 지정자 ) -> public (공통의 의미를 가지고있다)
	// 2. 리턴 타입 : 메소드 호출 이후 결과값이 돌아올수 있도록 하는 기능!
	// void -> 리턴의 타입이 존재하지 않는 경우!
	// 3. 메소드의 이름
	// 4. 매개변수 : 메소드를 사용할 때 재료값이 될 수 있는 데이터를 의미!
	// 5. 메소드의 대한 알고리즘 작성 : {} 몸체 안에 진행하고자 하는 연산 작업을 작성한다!
	// 6. return 키워드 사용! : 실제 메소드를 수행 한 후 발생되는 결과값을 지정할 수 있는 기능!
	// void -> 리턴의 타입이 void인 경우는 return 이라는 키워드를 작성하지 않는다.!

	// 메소드 사용 방법
	// 1. 메소드를 정의(선언)한다.
	// - 메소드를 생성 할 때에는 구조가 겹쳐지지 않도록 주의한다!

	// addNum(3,4);
	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
