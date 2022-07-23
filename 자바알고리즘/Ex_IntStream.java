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
		// �迭
		String[] strArray = { "a", "p", "p", "l", "e" };
		// forEach �Լ� : for ���� �ݺ����� ó���� �� ����ϴ� �Լ�
		Arrays.stream(strArray).forEach(s -> System.out.println(s)); // �迭���� forEach��� ���
		// -> : ����
		// Array.stream()�ȿ� �����ؼ� forEach�Լ��� ���

		// ����Ʈ
		List<String> list = List.of("Peter", "Thomas", "Edvard", "Gerhard");
		list.forEach(System.out::println); // ���ٽ� (���) list forEach ���ٽ� ���� ����

		// IntSream
		IntStream.range(1, 10).forEach(System.out::print);
		// range -> 1 �̻� 10�̸�
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		// rangeClosed -> 1 �̻� 10����
		System.out.println();
		intStream_range();

		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList();

		IntStream.range(0, n).forEach(i -> {
			arr.add(sc.nextInt());
		});

		System.out.println("�� : " + arr.stream().mapToInt(Integer::intValue).sum());
		System.out.println("��� : " + arr.stream().mapToInt(Integer::intValue).average().orElse(0));

		arr.clear();
	}

	// static ���� ��ü���� ���� �޼ҵ� ���� ����
	public static void intStream_range() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			if (i == 5) {
				return;
				// steam�� ��𼭺��� ������ �����϶�� ���� return �ߴٰ� �ؼ� �ű⼭ ���ߴ°�
				// �ƴ϶� ���� ���� 5�� ���ؼ��� �ƹ��͵� ���� �ʴ´�.
				// 5 �̻��� ������� �ʰ� �͵�� ����ó�� �ϸ� �ȴ� try-catch(RuntimeException e)
			}
			System.out.print(i);
		});
	}

}
