
public class PersonMain {

	public static void main(String[] args) {
		
		// ���� ������ ���赵�� �ҷ���
		// ���� ��ü(Object)�� ������ �� �ִ� ����!
		
		// 1. ���赵 �ҷ�����!
		// ���赵�� ������ ���� ��ü�� �����ϴ� ����� '�ν��Ͻ� ȭ'��� �Ѵ�!
		Person p1 = new Person("���ؿ�",28,"��");
		
		// 2. ��ü���� Person �����
		//p1.name = "���ؿ�";
		//p1.age=28;
		//p1.gender="��";
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		
		//p1�� ������ �ִ� eat() �ҷ�����!
		//p1.eat();
		//p1.move();
		//p1.sleep();
		
		// p2��� �ϴ� ��ü �����ϱ�
		// name="���ڿ�"
		// age = 20
		// gender ="��"
		
		Person p2 = new Person("���ڿ�",20,"��");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		
		//p2.name="���ڿ�";
		//p2.age=20;
		//p2.gender="��";
		
		//System.out.println(p2.name);
		
		//p2.eat();
		//p2.move();
		//p2.sleep();
	}

}
