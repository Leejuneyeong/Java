
public class TempEmployee extends Employee {

	// 부모가 가지고 있는 필드 그대로 사용
	
	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	@Override
	public int getMoneyPay() {
		return pay / 12;
	}
	
	// 부모클래스의 print() 메소드를 사용
}
