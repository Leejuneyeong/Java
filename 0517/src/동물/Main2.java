package 동물;

public class Main2 {

	public static void main(String[] args) {
		
		//다양한 교통수단 이동!
		// 버스, ktx -> 각각 설계도
		
		//Ktx ktx = new Ktx();
		//ktx.go();
		
		//Bus bus = new Bus();
		//bus.go();
		
		go(new Ktx());// 매서드를 이용한 객체 호출
		
	}
	
	// 상속의 관계에 의해 자동적으로 업캣흐팅이 가능 하므로
	// 다른 객체를 호출 하더라도 부모에 대한 객체를 확인후 사용 가능!
	public static void go(Transportation b) {
		b.go();
	}
}
