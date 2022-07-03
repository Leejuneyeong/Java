import java.util.Random;

public class Ex_04 {

	public static void main(String[] args) {

		// 1. 정수형의 배열 'array'
		// 크기는 10개
		int[] array = new int[10];
		// 2. 랜덤(Random)수 만드는 기능 불러오기
		// 범위는 1~20까지
		Random rd = new Random();

		// 3. 각 배열에 랜덤수 데이터 저장하기
		// for문 활용 가능
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20) + 1;
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();

		int sum1 = array[3] + array[8];

		System.out.println("합 : "+sum1);

		int sum2 = 0;
		double avg = 1;

		for (int i = 0; i < array.length; i++) {
			sum2 = sum2 + array[i];
		}

		avg = (double)sum2 / array.length;
		
		// 정수 정수 -> 정수
		// 실수 실수 -> 실수
		// 정수 실수 -> 실수
		
		/*
		int a =3;
		double b = 5.12;
		
		//실수 = 정수; -> 묵시적 형변환
		b=a;
		System.out.println("묵시적 형변환 : "+b);
		
		//명시적 형변환
		a=(int)b;
		System.out.println("명시적 형변환 : "+a);
		*/
		
		System.out.println("전체합 : "+sum2);
		System.out.println("평균 : "+avg);
	}

}
