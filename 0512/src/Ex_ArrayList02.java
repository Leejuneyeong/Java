import java.util.ArrayList;

import javax.print.attribute.standard.NumberUpSupported;

public class Ex_ArrayList02 {

	public static void main(String[] args) {
		
		// �������� ���� ���� �� �ִ� ArrayList ����!
		
		int[] arr = new int[2];
		//System.out.println(arr);
		
		int a =5;
		//System.out.println(a);
		// <> ��ü Ÿ�� -> ���۷����� Ÿ�� -> �ּҰ��� ���� Ÿ��
		// Ŭ������ ���ǵǾ� �ִ� ���뿡 �ѿ��� ArrayList Ÿ������ ���� ����!
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// 1. ������� 3,6,9,1������ �� �����ϱ�
		
		numbers.add(3);
		numbers.add(6);
		numbers.add(9);
		numbers.add(1);
		
		// 2. �ε����� ��ġ�� 2�� ���� ������ �� 5 �߰��ϱ�
		
		numbers.add(2,5); // <- �����ƴ� �ڷ� �з������� { 3,6,5,9,1 }
		
		// 3. 1�� �����Ͱ��� �ִ� ��ġ�� ã�� �ش� ������ �����ϱ�
		
		numbers.remove(4);
		
		// 4. numners�� �ִ� ��� ������ �� ����ϱ�
		
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i)+" ");
		}
	}

}
