
public class PiggyBank {

	int money;

	// this Ű����� �޼ҵ忡 �ִ� �Ű������� �ǹ��ϴ� ���� �ƴ϶�
	// ���赵 ( class ) ��ü������ ������ �ִ� �ʵ�

	public void deposit(int deposit) {
		System.out.println(deposit + "���� �Ա�");
		money += deposit;
	}

	/*
	  public void deposit(int money) { 
	        System.out.println(deposit+"���� �Ա�");
	    this.money=this.money+money; 
	  }
	 */

	public void withdraw(int withdraw) {
		System.out.println(withdraw + "���� ���");
		money -= withdraw;
	}

	public void showMoney() {
		System.out.println("���� �ܾ� : " + money + "��");
	}
}
