
public class PiggyBankMain {

	public static void main(String[] args) {
		//저금통 불러오기(객체 생성하기)
		PiggyBank money = new PiggyBank();
		
		money.deposit(1500);
		money.deposit(700);
		money.showMoney();
		money.withdraw(500);
		money.showMoney();
		
	}

}
