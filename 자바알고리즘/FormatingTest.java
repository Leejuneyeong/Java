import java.util.Scanner;

public class FormatingTest {

	public static void main(String[] args) {
		int a = 15; // 10진수 : 15 , 2진수 : 1111
        String b="";
        String c="";
        b = Integer.toString(a);
        // int 타입을 String 타입으로 변환
        
        c = String.format("%08d", Integer.parseInt(Integer.toBinaryString(a)));
        // String.format 포멧팅 : 정수형타입인데 총8개의 칸에서 빈공간은 0으로 채우고 나머지 공간은 a로 채움
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
        System.out.println("10진수 정수를 2진수 String으로 = "+Integer.toBinaryString(a));
        System.out.println("String을 정수형으로  = "+Integer.parseInt("1111"));
        System.out.println("포멧팅 사용 = "+String.format("%08d", 1111));
        // 공간을 8칸 만들고 1111 넣고 나머지 공간은 0으로 채움
	}

}
