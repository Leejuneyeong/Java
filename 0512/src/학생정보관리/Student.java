package 학생정보관리;

public class Student {
	
	//학생관리프로그램 설계도
	//1. 필드
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	//접근 제한자
	// 1) public : 클래스 내/외부에서 접근할 수 있는 접근제한자
	// 2) private : 외부에서는 접근을 못하고, 내부에 메서드를 통해서만 접근할 수 있도록 하는 제한자
	// 3) protected
	// 4) default
	
	// 데이터를 확인할 수 있는 메서드를 만들자 !
	// 지금의 필드는 설계도 내부에서만 접근가능 ----------> 메서드는 외부에서 접근할 수 있도록
	// getter() -----> 정보를 가지고 올떄 사용
	// setter() -----> 정보를 수정할 때, 입력할 때
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	//2. 메서드
	public Student(String name,String number, int age, int scoreJava,
			int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age =age;
		this.scoreJava=scoreJava;
		this.scoreWeb=scoreWeb;
		this.scoreAndroid=scoreAndroid;
	}
	
	public void show() {
		System.out.println(name+"님 안녕하세요.");
		System.out.println("[ "+number+", "+age+"살 ]");
		System.out.println(name+"님의 Java점수는 "+scoreJava+"점 입니다.");
		System.out.println(name+"님의 Web점수는 "+scoreWeb+"점 입니다.");
		System.out.println(name+"님의 Android점수는 "+scoreAndroid+"점 입니다.");
	}
}
