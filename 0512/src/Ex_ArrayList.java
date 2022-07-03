import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {

		// 배열 : 데이터의 형태가 같은 자료들이 한번에 관리될 수 있는 기능
		// 배열의 특징
		// 1. 크기가 지정되어 있다.
		// 2. 인덱스 번호([0],[1])를 사용하여 위치값을 알아낼수 있다.

		// ArrayList(가변 리스트) : 데이터의 형태(객체 형태)가 같은 자료들이 한번에 관리될 수 있는 기능
		// + 배열의 크기가 지정되지 않은 기능!

		// 1. ArrayList의 선언(생성)
		// 2. : 개체의 대한 타입을 지저왈 수 있는 제네릭 기법
		// 추가하기 -> add("")
		ArrayList<String> names = new ArrayList<>();
		names.add("이준영");
		names.add("홍길동");
		names.add("누구죠");

		// 3. 데이터를 출력(확인)해보기! -> get(index)
		// 확인을 위한 메소드!
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("names의 크기 : "+names.size());
		//4. 원하는 데이터 삭제하기 -> remove(index)
		names.remove(1);
		System.out.println("======");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("names의 크기 : "+names.size());
		
		names.add(1,"안녕요");
		System.out.println("======");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
