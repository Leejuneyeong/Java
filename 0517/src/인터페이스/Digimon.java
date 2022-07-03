package 인터페이스;

public interface Digimon {

	// 구현 X , 인터페이스는 추상적인 개념임
	// 추상화된 개념 ( 아구몬, 토우몬 보다 추상화된 개념)
	
	// 바디가 없는 메서드 ---> 추상메서드
	public abstract void attack();
	public abstract void specialAttack();
	
	// Digimon 인터페이스를 상속받는 모든~~ 자신클래스
	// 무조건 attack(), specialAttack() 구현을 해줘야함.
}
