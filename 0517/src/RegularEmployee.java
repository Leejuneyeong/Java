
public class RegularEmployee extends Employee{
	
	// 부모필드 그대로 사용
	int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		// 추상메서드
		// 자식클래스에서 강제적으로 구현
		// 바디가 있는 메서드로 구현
		
		return (pay+bonus)/12;
	}
	

	
	// 부모클래스의 print() 메소드를 사용
}
