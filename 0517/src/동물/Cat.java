package 동물;

public class Cat extends Animal{
	
	//고양이 설계도가 동물 설계도와 같이 eat(), move() 사용할 수 있도록 수정하기!
	// -> 상속 활용!
	
	// 고양이가 가질 수 있는 행위 만들기!
	
	public void eat() {
		System.out.println("할짝 할짝");
	}
	
	public void move() {
		System.out.println("냐옹냐옹 움직이기!!");
	}
}
