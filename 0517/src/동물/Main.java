package 동물;

public class Main {

	public static void main(String[] args) {
		
		// 모든 설계도는 main()가 있는 클래스에서 "객체" 생성이 가능하다.
		// 객체 생성 -> new 설계도();
		
		// 1. Animal 설계도를 가지고 a1 이라는 객체 생성!
		Animal a1 = new Animal();
		
		// 추상화(abstract) 해버리면 객체를 생성할 수 없음
		// 객체화-> 설계도를 통해서 무언가 생명체 생성하는것!
		// 설계가 완성이 되어야 객체화를 할 수 있다.
		
		// 일반 클래스 -> 완성된 설계도 
		// 추상 클래스 -> 미완성된 설계도
		
		
		// 2. Dog 설계도를 가지고 dog 라는 객체 생성!
		int num=4;
		
		String word="문자";
		
		Dog dog = new Dog();
		
		// 만들어진 객체들이 사용할 수 있는 행위 찾아보기!
		System.out.println("Animal");
		a1.eat();
		a1.move();
		
		System.out.println();
		System.out.println("Dog");
		dog.eat();
		dog.move();
		
		System.out.println();
		// 3. Cat 설계도로 cat 객체 생성
		// eat(), move() 
		
		Cat cat = new Cat();
		System.out.println("Cat");
		cat.eat();
		cat.move();
		
		// 형변환(Casting)
		// 기본 자료형 -> 묵시적, 명시적 캐스팅
		// 레퍼런스형(객체) -> 업캐스팅, 다운 캐스팅
		
		// 레퍼런스형 업캐스팅은 사전에 상속관계가 진행 되어야 한다.
		// 업캐스팅(자동적) : 자식클래스가 부모클래스 타입으로 형변환
		// 변수의 데이터 타입은 부모, 실제 객체 자식
		Animal dog1 = new Dog(); // -> 업 캐스팅(자식클래스가 부모클래스 타입으로 변환)
		
		System.out.println();
		System.out.println("=== 업캐스팅 결과 ===");
		dog1.eat();
		dog1.move();
		
		dog1.a();
		// 실체가 자식 클래스 이더라도 담겨져 있는 타입이 부모라면
		// 부모에 해당하는 메소드만 호출 할 수 있다.
			
		
		// 다운캐스팅 : 업캐스팅 되어있는 것을 강제적으로 원래 타입으로 되돌리는 것
		Dog dog2 = (Dog)dog1;
		dog2.eat();
		
		// 오류 1) 문법적인 오류
		// 오류 2) 런타임 오류 -> 문법에는 문제가 없지만 실제로 실행하면서 문제가 되는 것들을 오류로 표출!
		
		Animal a = new Animal();
		Dog dog3 = (Dog)a; // 런타임 오류
		dog3.eat();
		
		
		
		
		
	}

}
