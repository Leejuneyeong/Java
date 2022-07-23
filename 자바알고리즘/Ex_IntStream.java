import static java.lang.System.in;

import java.util.*;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex_IntStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		// 배열
		String[] strArray = { "a", "p", "p", "l", "e" };
		// forEach 함수 : for 같은 반복문을 처리할 때 사용하는 함수
		Arrays.stream(strArray).forEach(s -> System.out.println(s)); // 배열에서 forEach사용 방법
		// -> : 람다
		// Array.stream()안에 지정해서 forEach함수로 출력

		// 리스트
		List<String> list = List.of("Peter", "Thomas", "Edvard", "Gerhard");
		list.forEach(System.out::println); // 람다식 (출력) list forEach 람다식 생략 예제

		// IntSream
		IntStream.range(1, 10).forEach(System.out::print);
		// range -> 1 이상 10미만
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		// rangeClosed -> 1 이상 10이하
		System.out.println();
		intStream_range();

		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList();

		IntStream.range(0, n).forEach(i -> {
			arr.add(sc.nextInt());
		});

		System.out.println("합 : " + arr.stream().mapToInt(Integer::intValue).sum());
		System.out.println("평균 : " + arr.stream().mapToInt(Integer::intValue).average().orElse(0));

		arr.clear();
	}

	// static 쓰면 객체생성 없이 메소드 실행 가능
	public static void intStream_range() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			if (i == 5) {
				return;
				// steam은 어디서부터 어디까지 방출하라는 정의 return 했다고 해서 거기서 멈추는게
				// 아니라 단지 숫자 5에 대해서만 아무것도 하지 않는다.
				// 5 이상을 출력하지 않고 싶드면 예외처리 하면 된다 try-catch(RuntimeException e)
			}
			System.out.print(i);
		});
	}

}
