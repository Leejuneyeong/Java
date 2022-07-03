import java.util.ArrayList;

public class PocketMain {

	public static void main(String[] args) {

		// 1. ���ڻ���� ���赵�� ����Ͽ� ���� Ű��� ����
		// ���ϸ� ź�� ��Ű��!

		// set : ������ ���� ����(�ʱ�ȭ, ����, ����, ����)
		// get : ������ ���� �������� ���(�ҷ�����, �о����)
		PocketMon mon1 = new PocketMon();
		mon1.setName("�̻��ؾ�");
		mon1.setType("Ǯ");
		mon1.setLv(10);
		mon1.setAttack(80);
		mon1.setShield(90);
		mon1.setHp(100);

		// ������ �޼ҵ带 Ȱ���Ͽ� �ι� ° ���ϸ� �����!
		PocketMon mon2 = new PocketMon("���̸�", "��", 10, 90, 50, 120);

		// System.out.println(mon1.getName()+", "+mon1.getType()+", "+mon1.getLv()+", "+
		// mon1.getAttack()+", "+mon1.getShield()+", "+mon1.getHp());

		// System.out.println(mon2.getName()+", "+mon2.getType()+", "+mon2.getLv()+", "+
		// mon2.getAttack()+", "+mon2.getShield()+", "+mon2.getHp());

		// ���ϴ��� ����
		// mon1�� Ÿ�� �ٲ������!
		// mon1.type ="��";

		// System.out.println(mon1.name+", "+mon1.type+", "+mon1.lv+", "+
		// mon1.attack+", "+mon1.shield+", "+mon1.hp);

		mon1.offensive();
		// ���ݽ� hp ����
		mon2.defensive();
		// ���� ���� ����

		// ArrayList ����ؼ� ���ϸ� ���� �� �ִ� ���� �����!
		ArrayList<PocketMon> pocket = new ArrayList<>();

		pocket.add(mon1);
		pocket.add(mon2);

		System.out.println(pocket);

		for (int i = 0; i < pocket.size(); i++) {
			System.out.println(pocket.get(i).getName());
			System.out.println(pocket.get(i).getType());
			System.out.println(pocket.get(i).getLv());
		}

	}

}
