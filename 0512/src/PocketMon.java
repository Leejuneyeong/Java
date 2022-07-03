import java.util.Random;

public class PocketMon {

	// 포켓몬을 설계하기 위한 포켓몬 도감
	// 포켓몬이라면 가지고 있어야 하는 속성(필드)
	// 타입, 이름, 공격력, 방어력, 레벨, 체력
	private String name;
	private String type;
	private int lv;
	private int attack;
	private int shield;
	private int hp;

	// 외부로부터 보호되고 있는 필드에 접근하기 위한 우회적인 getter/setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public PocketMon() {

	}

	public PocketMon(String name, String type, int lv, int attack, int shield, int hp) {
		this.name = name;
		this.type = type;
		this.lv = lv;
		this.attack = attack;
		this.shield = shield;
		this.hp = hp;
	}
	
	Random rd = new Random();
	
	public void offensive() {
		int num1 = rd.nextInt(10) + 1;
		hp=hp-num1;
		System.out.println(name + "가 공격을 시도했다!!");
		System.out.println(name+"의 체략이 " +hp+"가 됐다..!!");
	}

	public void defensive() {
		int num1 = rd.nextInt(10) + 1;
		shield = shield+num1;
		System.out.println("으랏차! " + name + "의 방어 성공..!");
		System.out.println(name+"의 방어력이 "+num1+"만큼 올랐다!!!");
	}
}
