// 추상 클래스인 Employee를 상속 받게 만들자
public class Manager extends Employee{
	// empno, pay, name
	@Override
	public int getMoneyPay() {
		return (pay*2)/12;
	}
	// print -->일반 메서드
	// 구현을 할 필요가 없어요 물려주는
	// 기능을 그대로 사용
		
}
