package 동물;

public class Dog extends Animal{
	// Dog 클래스를 Animal이라는 클래스를 물려(확장=extends)받아 생성하곘다.
	
	
	//main에서 Dog를 호출했을 때 데이터의 흐름
	// 1.Dog 설계도로 이용!
	// 2.해당하는 설계도에 원하는 기능이 없을 궁여 상속 클래스 확인!
	// 3.상속받고 있는 Animak 클래스로 이동!
	// 4. Animal에 해당 기능이 있는 지 확인 !
	
	
	// 메소드 오버라이딩(재정의)
	public void eat() {
		System.out.println("개껌 냠냠");
	}
	
	public void move() {
		System.out.println("꼬리 살랑살랑 움직이기!");
	}

	public void b() {
		System.out.println("이 메소드는 Dog가 가지고 있습니다.");
	}
}
