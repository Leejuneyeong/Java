
public abstract class Employee {
// �߻�޼��带 �ϳ� �����ϰ� �־ �߻�Ŭ������ �ٲ� �����.
	
	// Regular, PartTime, Temp
	
	// 3 ���� ������ �ִ� �������� Ư¡�� 
	// ��������!!!
	// �ʵ� 
	// empno, name, pay
	
	String empno;
	String name;
	int pay;

	// �޼���
	// getMoneyPay, print
	
	//�ٵ���� �޼��� ---> �߻�޼���
	public abstract int getMoneyPay();
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
}
