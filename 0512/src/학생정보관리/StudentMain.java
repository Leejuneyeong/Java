package �л���������;

public class StudentMain {

	public static void main(String[] args) {
		// ���赵�� ����ؼ� ���α׷��� ����� ����,�����Ű�� ����
		Student s1 = new Student("ȫ�浿","20150675",22,50,89,77);
		Student s2 = new Student("�迵��","20090541",29,90,25,30);
	
		s1.show();
		System.out.println("====================================");
		s2.show();
		System.out.println("====================================");
		
		s2.setName("���ؿ�");
		s2.setNumber("20210512");
		s2.setAge(28);
		s2.setScoreJava(100);
		s2.setScoreWeb(100);
		s2.setScoreAndroid(100);
		s2.show();
		
	
	}

}
