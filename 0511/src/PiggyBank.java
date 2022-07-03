
public class PiggyBank {

	int money;

	// this 키워드는 메소드에 있는 매개변수를 의미하는 것이 아니라
	// 설계도 ( class ) 자체적으로 가지고 있는 필드

	public void deposit(int deposit) {
		System.out.println(deposit + "원을 입금");
		money += deposit;
	}

	/*
	  public void deposit(int money) { 
	        System.out.println(deposit+"원을 입금");
	    this.money=this.money+money; 
	  }
	 */

	public void withdraw(int withdraw) {
		System.out.println(withdraw + "원을 출금");
		money -= withdraw;
	}

	public void showMoney() {
		System.out.println("현재 잔액 : " + money + "원");
	}
}
