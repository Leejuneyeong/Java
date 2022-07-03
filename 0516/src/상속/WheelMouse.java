package 상속;

public class WheelMouse extends Mouse{
	//상속의 키워드 : extends
	
	// 부모의 기능인 좌클릭을 불려받아
	// 나만의 새로운 기능으로 만들기! -> 재정의 (오버라이딩)
	
	public void leftClick() {
		System.out.println("빠르게 더블 좌클릭! ");
	}
	
	public void RightClick() {
		System.out.println("빠르게 더블 우클릭! ");
	}
	
	// 휠기능 (추가)
	public void wheel() {
		System.out.println("드르륵 ~ 휠 사용하기~~");
	}
}
