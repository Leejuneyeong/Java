package 동물;

public class Animal {
	
	// 그냥 기능 자체를 일반적으로 물려주겠다.. --> 상속 extends
	// 강제적으로 꼭 구현하도록 물려주겠다.. --> 인터페이스(interface)
	// 물려주기는 하나 구체적인 내용은 알아서 했으면 한다.. -> 추상화(abstract)
	
	//(부모) Animal
	//(자식) Dog, Cat, ...
	
	// 일반 메소드 생성하기
	// 동물이라면 먹는 행동! -> eat() -> "먹다"
	
	public void eat() {
		System.out.println("먹다.");
	}
	
	// 동물이라면 움직이는 행동! - > move() -> "움직이다"
	
	public void move() {
		System.out.println("움직이다.");
	}
	
	public void a() {
		System.out.println("이 메소드는 Animal에 있습니다.");
	}
}
