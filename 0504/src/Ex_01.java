
public class Ex_01 {

	public static void main(String[] args) {
	
		// 배열(Array) : 같은 타입의 데이터들을 한번에 관리할 수 있는 형태
		
		// 1. 배열 선언
		// 데이터 타입[] 이름 = new 데이터 타입[크기]
		
		// 정수형의 크기가 5개 짜리 배열 생성하기
		// in arr[] = new int[5];
		int[] arr = new int[5];
		
		String[] arr2 = new String[3];
		
		// 배열의 이름만 호출할 시 
		// 보여지는 결과값은 배열의 '주소값' 이다. 
		/*System.out.println(arr);
	    System.out.println(arr2);
	    */	
		
		
		//3. 배열에 데이터 값 저장하기
		arr[0] = 5;
		arr[1] = 7;
		arr[2] = 4;
		arr[3] = 1;
		arr[4] = 3;
		
		// 2. 배열의 세부적인 위치 접근 (위치 호출)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// 배열의 값 수정
		
	}

}
