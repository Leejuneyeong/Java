package ����;

public class Main2 {

	public static void main(String[] args) {
		
		//�پ��� ������� �̵�!
		// ����, ktx -> ���� ���赵
		
		//Ktx ktx = new Ktx();
		//ktx.go();
		
		//Bus bus = new Bus();
		//bus.go();
		
		go(new Ktx());// �ż��带 �̿��� ��ü ȣ��
		
	}
	
	// ����� ���迡 ���� �ڵ������� ��Ĺ������ ���� �ϹǷ�
	// �ٸ� ��ü�� ȣ�� �ϴ��� �θ� ���� ��ü�� Ȯ���� ��� ����!
	public static void go(Transportation b) {
		b.go();
	}
}
