import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();

		/*
		 * int count = 1;
		 * 
		 * System.out.print(count + "주차 감량 몸무게 : "); int num = sc.nextInt();
		 * 
		 * int sub = now - num;
		 * 
		 * /*do { count++; System.out.print(count + "주차 감량 몸무게 : "); num = sc.nextInt();
		 * sub = sub - num;
		 * 
		 * } while (sub >= goal); System.out.println(sub + "kg 달성!! 축하합니다!");
		 */
		/*
		 * int count =0; while(true) { count++; System.out.print(count +
		 * "주차 감량 몸무게 : "); int num = sc.nextInt(); now = now - num;
		 * 
		 * System.out.println(now); if(now<=goal) { System.out.println(now +
		 * "kg 달성!! 축하합니다!"); break; } } }
		 */

		/*
		 * int count = 0; while (true) { count++; System.out.print(count +
		 * "주차 감량 몸무게 : "); int num = sc.nextInt(); now = now - num;
		 * System.out.println(now); if (now <= goal) { System.out.println(now +
		 * "kg 달성!! 축하합니다!"); break; } }
		 */
		int count = 0;
		while (true) {
			count++;
			System.out.print(count + "주차 감량 몸무게 : ");
			int num = sc.nextInt();
			int sub = now - num;
			now = sub;
			if (now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!");
				break;
			}
		}
	}
}