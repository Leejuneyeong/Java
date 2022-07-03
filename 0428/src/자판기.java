import java.util.Scanner;

public class 자판기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 금액 입력 받기
		// ex) " 금액을 입력하세요 >> "
		System.out.print("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		
		// 2. 선택할 수 있는 메뉴 출력하기
		// ex) syso( "[1]콜라(800원) [2]생수(500원) [3]비타민워터(1500원)" )
		
		
		System.out.println("[1]콜라(800원) [2]생수(500원) [3]비타민워터(1500원)");
		
		// 3. 메뉴 입력 받기
		// 4. 잔돈 계산하기
				// ex)입금액 : 2500 / 1번 메뉴 선택-> 잔돈 : 1700원 출력 
		
		System.out.print("메뉴 번호 선택 >> ");
		int menu = sc.nextInt();
		int price = 0;
		
		if(menu==1) {
			price = 800;
		}else if(menu==2) {
			price = 500;
		}
		else {
			price =1500;
		}
		
		if(money>=price) {
			
			
			switch(menu) {
			case 1 :
			
			
				int left= money-price;
				
				if(money>=800) {
					System.out.println("잔돈은 "+left+"원 입니다.");
				
					int result = left/1000;
					
					System.out.print("천원 : "+result+"개"+" ");
					int result2 = left-result*1000;
					
					int a = result2/500; 
					System.out.print("오백원 : "+a+"개"+" ");
					
					int b =(result2-a*500)/100;
					System.out.print("백원 : "+b+"개");
					
				}
				else {
					System.out.println("돈이 부족해요.");
				}
				
				break;
			
		    case 2 :
			  
	
			    int left2= money-price;
				
				if(money>=500) {
					System.out.println("잔돈은 "+left2+"원 입니다.");
					
					int result = left2/1000;
					
					System.out.print("천원 : "+result+"개"+" ");
					int result2 = left2-result*1000;
					
					int a = result2/500; 
					System.out.print("오백원 : "+a+"개"+" ");
					
					int b =(result2-a*500)/100;
					System.out.print("백원 : "+b+"개");
					
				}
				else {
					System.out.println("돈이 부족해요.");
				}
				
			    break;
		    
		    case 3 :
			   
			 
			    int left3 = money-price;
			    
			    if(money>=1500) {
					System.out.println("잔돈은 "+left3+"원 입니다.");
					
					int result = left3/1000;
					
					System.out.print("천원 : "+result+"개"+" ");
					int result2 = left3-result*1000;
					
					int a = result2/500; 
					System.out.print("오백원 : "+a+"개"+" ");
					
					int b =(result2-a*500)/100;
					System.out.print("백원 : "+b+"개");
				}
				else {
					System.out.println("돈이 부족해요.");
				}
			    
			    break;
			    
			default :
				System.out.println("메뉴가 없습니다.");
				break;
		}
		}
		
		else {
			System.out.println("돈이 부족합니다 ㅜㅜ");
		}
		
		
		/*int input = sc.nextInt();
		
		switch(input) {
		case 1 :
		
			int coke = 800;
			
			int left= money-coke;
			
			if(money>=800) {
				System.out.println("잔돈은 "+left+"원 입니다.");
			
				int result = left/1000;
				
				System.out.print("천원 : "+result+"개"+" ");
				int result2 = left-result*1000;
				
				int a = result2/500; 
				System.out.print("오백원 : "+a+"개"+" ");
				
				int b =(result2-a*500)/100;
				System.out.print("백원 : "+b+"개");
				
			}
			else {
				System.out.println("돈이 부족해요.");
			}
			
			break;
		
	    case 2 :
		  
		    int water = 500;
		    int left2= money-water;
			
			if(money>=500) {
				System.out.println("잔돈은 "+left2+"원 입니다.");
				
				int result = left2/1000;
				
				System.out.print("천원 : "+result+"개"+" ");
				int result2 = left2-result*1000;
				
				int a = result2/500; 
				System.out.print("오백원 : "+a+"개"+" ");
				
				int b =(result2-a*500)/100;
				System.out.print("백원 : "+b+"개");
				
			}
			else {
				System.out.println("돈이 부족해요.");
			}
			
		    break;
	    
	    case 3 :
		   
		    int vitamin = 1500;
		    int left3 = money-vitamin;
		    
		    if(money>=1500) {
				System.out.println("잔돈은 "+left3+"원 입니다.");
				
				int result = left3/1000;
				
				System.out.print("천원 : "+result+"개"+" ");
				int result2 = left3-result*1000;
				
				int a = result2/500; 
				System.out.print("오백원 : "+a+"개"+" ");
				
				int b =(result2-a*500)/100;
				System.out.print("백원 : "+b+"개");
			}
			else {
				System.out.println("돈이 부족해요.");
			}
		    
		    break;
		    
		default :
			System.out.println("메뉴가 없습니다.");
			break;
	}
	*/
	
		
		/*if(input == 1) {
			int result = money-800;
			System.out.println("잔돈은 : "+result+"원 입니다.");
		}
		else if(input == 2) {
			int result = money-500;
			System.out.println("잔돈은 : "+result+"원 입니다.");
		}
		else if(input == 3) {
			int result = money-1500;
			System.out.println("잔돈은 : "+result+"원 입니다.");
		}
		else {
			System.out.println("잔돈이 없습니다.");
		}
		*/
		 
	}

}
