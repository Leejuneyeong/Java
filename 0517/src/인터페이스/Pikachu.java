package 인터페이스;

public class Pikachu implements Digimon, Pokemon {

	@Override
	public void attack() {
		System.out.println("전기 충격");
	}

	@Override
	public void specialAttack() {
		System.out.println("백만 볼트!!~~~~~~~");
	}
	
	
	// 인터페이스
	// 추상클래스 : 바디를 가지고있는 메서드+추상메서드
	// 인터페이스 : 바디가 없는 메서드만을 포함(구현되지않은 메서드)
	// --------> 찐 중에서 찐으로 설계도
	
	//인터페이스 특징
	// 1) 인터페이스는 다중상속이 가능하다!!
	// 2) 작업명세서 or 프로세스 설계도
	// 3) 기능만을 정의함으로써 구현, 객체같은 동작들은 자식클래스
	// (구현을 강제성)
	// 단, 같은 타입, 같은 이름으로 메서드를 구현(오버라이딩)
	
	// JDBC : java 와 DataBase를 연결하는 API
}


