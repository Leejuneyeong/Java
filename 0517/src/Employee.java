
public abstract class Employee {
// 추상메서드를 하나 포함하고 있어서 추상클래스로 바꿔 줘야함.
	
	// Regular, PartTime, Temp
	
	// 3 명이 가지고 있는 공통적인 특징을 
	// 물려주자!!!
	// 필드 
	// empno, name, pay
	
	String empno;
	String name;
	int pay;

	// 메서드
	// getMoneyPay, print
	
	//바디없는 메서드 ---> 추상메서드
	public abstract int getMoneyPay();
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
}
