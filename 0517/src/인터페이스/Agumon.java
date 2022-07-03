package 인터페이스;

public class Agumon implements Digimon, Pokemon{

	// 인터페이스를 위한 키워드
	// implements
	// 다중상속 가능
	
	@Override
	public void attack() {
		System.out.println("아구몬 공격!!!!!!");
		
	}

	@Override
	public void specialAttack() {
		System.out.println("아구몬 특수공격!!!!!!!!!!");
		
	}

}
