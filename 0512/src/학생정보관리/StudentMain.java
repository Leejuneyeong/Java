package 학생정보관리;

public class StudentMain {

	public static void main(String[] args) {
		// 설계도를 사용해서 프로그램을 만드는 공간,실행시키는 공간
		Student s1 = new Student("홍길동","20150675",22,50,89,77);
		Student s2 = new Student("김영희","20090541",29,90,25,30);
	
		s1.show();
		System.out.println("====================================");
		s2.show();
		System.out.println("====================================");
		
		s2.setName("이준영");
		s2.setNumber("20210512");
		s2.setAge(28);
		s2.setScoreJava(100);
		s2.setScoreWeb(100);
		s2.setScoreAndroid(100);
		s2.show();
		
	
	}

}
