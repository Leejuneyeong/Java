
public class PersonMain {

	public static void main(String[] args) {
		
		// 내가 설계한 설계도를 불러와
		// 실제 객체(Object)를 생성할 수 있는 공간!
		
		// 1. 설계도 불러오기!
		// 설계도를 가지고 실제 객체를 생성하는 기법을 '인스턴스 화'라고 한다!
		Person p1 = new Person("이준영",28,"남");
		
		// 2. 구체적인 Person 만들기
		//p1.name = "이준영";
		//p1.age=28;
		//p1.gender="남";
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		
		//p1이 가지고 있는 eat() 불러오기!
		//p1.eat();
		//p1.move();
		//p1.sleep();
		
		// p2라고 하는 객체 생성하기
		// name="조자연"
		// age = 20
		// gender ="여"
		
		Person p2 = new Person("조자연",20,"여");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		
		//p2.name="조자연";
		//p2.age=20;
		//p2.gender="여";
		
		//System.out.println(p2.name);
		
		//p2.eat();
		//p2.move();
		//p2.sleep();
	}

}
