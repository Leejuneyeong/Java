
public class PiggyBankMain {

	public static void main(String[] args) {
		//������ �ҷ�����(��ü �����ϱ�)
		PiggyBank money = new PiggyBank();
		
		money.deposit(1500);
		money.deposit(700);
		money.showMoney();
		money.withdraw(500);
		money.showMoney();
		
	}

}
