package 상속;

public class Main2 {

	public static void main(String[] args) {
		
		// 내가 설계한 마우스가 잘 작동되는지 확인해보기!
		
		// 1. 내가 설계한 Mouse 설계도 불러와서 객체 생성하기!
		
		Mouse m1 = new Mouse();
		
		m1.leftClick();
		m1.rightClick();
	    m1.drag();
		
		System.out.println();
		
		// 2. 새롭게 설계한 WheelMouse의 기능들 사용하기!
		// - WheelMouse 객체 불러오기(생성하기)
		WheelMouse wm = new WheelMouse();
		wm.leftClick();
		wm.rightClick();
		wm.wheel();
		wm.drag();
		// - 좌 클릭
		// - 우 클릭
		// - 휠 기능
		
	}

}
