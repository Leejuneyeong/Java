
public class PartTimeEmployee extends Employee {
	//부모 필드 가져다 씀
	int workDay;

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}
	
	// 부모클래스의 print() 메소드를 사용
}
