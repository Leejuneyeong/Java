
public class RegularEmployee extends Employee{
	
	// �θ��ʵ� �״�� ���
	int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		// �߻�޼���
		// �ڽ�Ŭ�������� ���������� ����
		// �ٵ� �ִ� �޼���� ����
		
		return (pay+bonus)/12;
	}
	

	
	// �θ�Ŭ������ print() �޼ҵ带 ���
}
