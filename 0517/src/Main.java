
public class Main {

	public static void main(String[] args) {
		RegularEmployee nodong1 = new RegularEmployee("SMHRD001", "ȫ�浿", 4000, 400);

		System.out.println(nodong1.print());

		System.out.println(nodong1.getMoneyPay() + "����");

		TempEmployee nodong2 = new TempEmployee("SMHRDOO2", "�ڹ���", 3000);

		System.out.println(nodong2.print());

		System.out.println(nodong2.getMoneyPay() + "����");
		
		PartTimeEmployee nodong3 = new PartTimeEmployee("SMHRDOO1", "ȫ�浿", 10,10);
		
		System.out.println(nodong3.print());

		System.out.println(nodong3.getMoneyPay() + "����");
		
		Manager nodong4 = new Manager();
		nodong4.empno="SMHRD005";
		nodong4.name="ȫ�浿";
		nodong4.pay=5000;
		
		//�ٵ� ���� �޼��带 ��ӹ޾Ƽ�
		//������*�������̵�)�� �޼���
		nodong4.getMoneyPay();
		System.out.println(nodong4.getMoneyPay());
		
		System.out.println(nodong4.print());
	}

}