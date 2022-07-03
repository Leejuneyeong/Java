import java.util.ArrayList;

import javax.print.attribute.standard.NumberUpSupported;

public class Ex_ArrayList02 {

	public static void main(String[] args) {
		
		// 정수형의 값을 담을 수 있는 ArrayList 생성!
		
		int[] arr = new int[2];
		//System.out.println(arr);
		
		int a =5;
		//System.out.println(a);
		// <> 객체 타입 -> 레퍼런스형 타입 -> 주소값을 갖는 타입
		// 클래스로 정의되어 있는 내용에 한에서 ArrayList 타입으로 지정 가능!
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// 1. 순서대로 3,6,9,1데이터 값 저장하기
		
		numbers.add(3);
		numbers.add(6);
		numbers.add(9);
		numbers.add(1);
		
		// 2. 인덱스의 위치가 2인 곳에 데이터 값 5 추가하기
		
		numbers.add(2,5); // <- 삭제아님 뒤로 밀려난거임 { 3,6,5,9,1 }
		
		// 3. 1의 데이터값이 있는 위치를 찾아 해당 데이터 삭제하기
		
		numbers.remove(4);
		
		// 4. numners에 있는 모든 데이터 값 출력하기
		
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i)+" ");
		}
	}

}
