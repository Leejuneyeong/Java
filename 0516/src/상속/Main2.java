package ���;

public class Main2 {

	public static void main(String[] args) {
		
		// ���� ������ ���콺�� �� �۵��Ǵ��� Ȯ���غ���!
		
		// 1. ���� ������ Mouse ���赵 �ҷ��ͼ� ��ü �����ϱ�!
		
		Mouse m1 = new Mouse();
		
		m1.leftClick();
		m1.rightClick();
	    m1.drag();
		
		System.out.println();
		
		// 2. ���Ӱ� ������ WheelMouse�� ��ɵ� ����ϱ�!
		// - WheelMouse ��ü �ҷ�����(�����ϱ�)
		WheelMouse wm = new WheelMouse();
		wm.leftClick();
		wm.rightClick();
		wm.wheel();
		wm.drag();
		// - �� Ŭ��
		// - �� Ŭ��
		// - �� ���
		
	}

}
