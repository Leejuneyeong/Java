import java.util.ArrayList;

public class PocketMain {

	public static void main(String[] args) {

		// 1. 오박사님의 설계도를 사용하여 내가 키우고 싶음
		// 포켓몬 탄생 시키기!

		// set : 데이터 값을 셋팅(초기화, 저장, 대입, 변경)
		// get : 데이터 값을 가져오는 기능(불러오기, 읽어오기)
		PocketMon mon1 = new PocketMon();
		mon1.setName("이상해씨");
		mon1.setType("풀");
		mon1.setLv(10);
		mon1.setAttack(80);
		mon1.setShield(90);
		mon1.setHp(100);

		// 생성자 메소드를 활용하여 두번 째 포켓몬 만들기!
		PocketMon mon2 = new PocketMon("파이리", "불", 10, 90, 50, 120);

		// System.out.println(mon1.getName()+", "+mon1.getType()+", "+mon1.getLv()+", "+
		// mon1.getAttack()+", "+mon1.getShield()+", "+mon1.getHp());

		// System.out.println(mon2.getName()+", "+mon2.getType()+", "+mon2.getLv()+", "+
		// mon2.getAttack()+", "+mon2.getShield()+", "+mon2.getHp());

		// 로켓단의 등장
		// mon1의 타입 바꿔버리기!
		// mon1.type ="물";

		// System.out.println(mon1.name+", "+mon1.type+", "+mon1.lv+", "+
		// mon1.attack+", "+mon1.shield+", "+mon1.hp);

		mon1.offensive();
		// 공격시 hp 감소
		mon2.defensive();
		// 방어시 방어력 증가

		// ArrayList 사용해서 포켓몬만 담을 수 있는 가방 만들기!
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
