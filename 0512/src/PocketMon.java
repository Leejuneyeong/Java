import java.util.Random;

public class PocketMon {

	// ���ϸ��� �����ϱ� ���� ���ϸ� ����
	// ���ϸ��̶�� ������ �־�� �ϴ� �Ӽ�(�ʵ�)
	// Ÿ��, �̸�, ���ݷ�, ����, ����, ü��
	private String name;
	private String type;
	private int lv;
	private int attack;
	private int shield;
	private int hp;

	// �ܺηκ��� ��ȣ�ǰ� �ִ� �ʵ忡 �����ϱ� ���� ��ȸ���� getter/setter �޼ҵ�
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
		System.out.println(name + "�� ������ �õ��ߴ�!!");
		System.out.println(name+"�� ü���� " +hp+"�� �ƴ�..!!");
	}

	public void defensive() {
		int num1 = rd.nextInt(10) + 1;
		shield = shield+num1;
		System.out.println("������! " + name + "�� ��� ����..!");
		System.out.println(name+"�� ������ "+num1+"��ŭ �ö���!!!");
	}
}
