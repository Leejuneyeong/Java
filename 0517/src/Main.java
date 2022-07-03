
public class Main {

	public static void main(String[] args) {
		RegularEmployee nodong1 = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);

		System.out.println(nodong1.print());

		System.out.println(nodong1.getMoneyPay() + "만원");

		TempEmployee nodong2 = new TempEmployee("SMHRDOO2", "박문수", 3000);

		System.out.println(nodong2.print());

		System.out.println(nodong2.getMoneyPay() + "만원");
		
		PartTimeEmployee nodong3 = new PartTimeEmployee("SMHRDOO1", "홍길동", 10,10);
		
		System.out.println(nodong3.print());

		System.out.println(nodong3.getMoneyPay() + "만원");
		
		Manager nodong4 = new Manager();
		nodong4.empno="SMHRD005";
		nodong4.name="홍길동";
		nodong4.pay=5000;
		
		//바디가 없는 메서드를 상속받아서
		//재정의*오버라이딩)한 메서드
		nodong4.getMoneyPay();
		System.out.println(nodong4.getMoneyPay());
		
		System.out.println(nodong4.print());
	}

}