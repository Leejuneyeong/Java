package ����;

public class Animal {
	
	// �׳� ��� ��ü�� �Ϲ������� �����ְڴ�.. --> ��� extends
	// ���������� �� �����ϵ��� �����ְڴ�.. --> �������̽�(interface)
	// �����ֱ�� �ϳ� ��ü���� ������ �˾Ƽ� ������ �Ѵ�.. -> �߻�ȭ(abstract)
	
	//(�θ�) Animal
	//(�ڽ�) Dog, Cat, ...
	
	// �Ϲ� �޼ҵ� �����ϱ�
	// �����̶�� �Դ� �ൿ! -> eat() -> "�Դ�"
	
	public void eat() {
		System.out.println("�Դ�.");
	}
	
	// �����̶�� �����̴� �ൿ! - > move() -> "�����̴�"
	
	public void move() {
		System.out.println("�����̴�.");
	}
	
	public void a() {
		System.out.println("�� �޼ҵ�� Animal�� �ֽ��ϴ�.");
	}
}
