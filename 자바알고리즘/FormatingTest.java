import java.util.Scanner;

public class FormatingTest {

	public static void main(String[] args) {
		int a = 15; // 10���� : 15 , 2���� : 1111
        String b="";
        String c="";
        b = Integer.toString(a);
        // int Ÿ���� String Ÿ������ ��ȯ
        
        c = String.format("%08d", Integer.parseInt(Integer.toBinaryString(a)));
        // String.format ������ : ������Ÿ���ε� ��8���� ĭ���� ������� 0���� ä��� ������ ������ a�� ä��
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
        System.out.println("10���� ������ 2���� String���� = "+Integer.toBinaryString(a));
        System.out.println("String�� ����������  = "+Integer.parseInt("1111"));
        System.out.println("������ ��� = "+String.format("%08d", 1111));
        // ������ 8ĭ ����� 1111 �ְ� ������ ������ 0���� ä��
	}

}
