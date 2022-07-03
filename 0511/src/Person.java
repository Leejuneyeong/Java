
public class Person {
	// Person 객체를 생성하기 위한 설계도 작성 부분!
	// 설계도는 설계만 진행하므로 실행의 의미가 있는 main() 안만듬

	// Person 클래스의 구조!
	// 이름, 성격, 머리스타일, 키, 몸무게, 나이, 성별
	// -> 1. 필드 = data, 속성

	String name;
	int age;
	String gender;

	// 먹기,자기,놀기,움직이기 . . .
	// -> 2. 메소드 = Logic, 행위, 기능
	
	//[생성자]
	// 객체를 생성함과 동시에 옵션값을 부여 하는 메소드
	// 1. 리턴타입이 없다! (void 자체도 사용 안함)
	// 2. 메소드의 이름은 클래스의 이름과 동일하다.
	// 3. 생성자 메소드는 main() 메소드에서 객체를 생성하는 순간
	//    자동적으로 호출된다.
	public Person(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	public void eat() {
		System.out.println("맛있는 탄수화물 냠냠!");
	}

	public void sleep() {
		System.out.println("배부르고 따뜻한 잠자리zzz");
	}

	public void move() {
		System.out.println("( •_•)>⌐■-■");
	}
}