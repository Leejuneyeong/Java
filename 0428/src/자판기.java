import java.util.Scanner;

public class ���Ǳ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. �ݾ� �Է� �ޱ�
		// ex) " �ݾ��� �Է��ϼ��� >> "
		System.out.print("�ݾ��� �Է��ϼ��� >> ");
		int money = sc.nextInt();
		
		// 2. ������ �� �ִ� �޴� ����ϱ�
		// ex) syso( "[1]�ݶ�(800��) [2]����(500��) [3]��Ÿ�ο���(1500��)" )
		
		
		System.out.println("[1]�ݶ�(800��) [2]����(500��) [3]��Ÿ�ο���(1500��)");
		
		// 3. �޴� �Է� �ޱ�
		// 4. �ܵ� ����ϱ�
				// ex)�Աݾ� : 2500 / 1�� �޴� ����-> �ܵ� : 1700�� ��� 
		
		System.out.print("�޴� ��ȣ ���� >> ");
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
					System.out.println("�ܵ��� "+left+"�� �Դϴ�.");
				
					int result = left/1000;
					
					System.out.print("õ�� : "+result+"��"+" ");
					int result2 = left-result*1000;
					
					int a = result2/500; 
					System.out.print("����� : "+a+"��"+" ");
					
					int b =(result2-a*500)/100;
					System.out.print("��� : "+b+"��");
					
				}
				else {
					System.out.println("���� �����ؿ�.");
				}
				
				break;
			
		    case 2 :
			  
	
			    int left2= money-price;
				
				if(money>=500) {
					System.out.println("�ܵ��� "+left2+"�� �Դϴ�.");
					
					int result = left2/1000;
					
					System.out.print("õ�� : "+result+"��"+" ");
					int result2 = left2-result*1000;
					
					int a = result2/500; 
					System.out.print("����� : "+a+"��"+" ");
					
					int b =(result2-a*500)/100;
					System.out.print("��� : "+b+"��");
					
				}
				else {
					System.out.println("���� �����ؿ�.");
				}
				
			    break;
		    
		    case 3 :
			   
			 
			    int left3 = money-price;
			    
			    if(money>=1500) {
					System.out.println("�ܵ��� "+left3+"�� �Դϴ�.");
					
					int result = left3/1000;
					
					System.out.print("õ�� : "+result+"��"+" ");
					int result2 = left3-result*1000;
					
					int a = result2/500; 
					System.out.print("����� : "+a+"��"+" ");
					
					int b =(result2-a*500)/100;
					System.out.print("��� : "+b+"��");
				}
				else {
					System.out.println("���� �����ؿ�.");
				}
			    
			    break;
			    
			default :
				System.out.println("�޴��� �����ϴ�.");
				break;
		}
		}
		
		else {
			System.out.println("���� �����մϴ� �̤�");
		}
		
		
		/*int input = sc.nextInt();
		
		switch(input) {
		case 1 :
		
			int coke = 800;
			
			int left= money-coke;
			
			if(money>=800) {
				System.out.println("�ܵ��� "+left+"�� �Դϴ�.");
			
				int result = left/1000;
				
				System.out.print("õ�� : "+result+"��"+" ");
				int result2 = left-result*1000;
				
				int a = result2/500; 
				System.out.print("����� : "+a+"��"+" ");
				
				int b =(result2-a*500)/100;
				System.out.print("��� : "+b+"��");
				
			}
			else {
				System.out.println("���� �����ؿ�.");
			}
			
			break;
		
	    case 2 :
		  
		    int water = 500;
		    int left2= money-water;
			
			if(money>=500) {
				System.out.println("�ܵ��� "+left2+"�� �Դϴ�.");
				
				int result = left2/1000;
				
				System.out.print("õ�� : "+result+"��"+" ");
				int result2 = left2-result*1000;
				
				int a = result2/500; 
				System.out.print("����� : "+a+"��"+" ");
				
				int b =(result2-a*500)/100;
				System.out.print("��� : "+b+"��");
				
			}
			else {
				System.out.println("���� �����ؿ�.");
			}
			
		    break;
	    
	    case 3 :
		   
		    int vitamin = 1500;
		    int left3 = money-vitamin;
		    
		    if(money>=1500) {
				System.out.println("�ܵ��� "+left3+"�� �Դϴ�.");
				
				int result = left3/1000;
				
				System.out.print("õ�� : "+result+"��"+" ");
				int result2 = left3-result*1000;
				
				int a = result2/500; 
				System.out.print("����� : "+a+"��"+" ");
				
				int b =(result2-a*500)/100;
				System.out.print("��� : "+b+"��");
			}
			else {
				System.out.println("���� �����ؿ�.");
			}
		    
		    break;
		    
		default :
			System.out.println("�޴��� �����ϴ�.");
			break;
	}
	*/
	
		
		/*if(input == 1) {
			int result = money-800;
			System.out.println("�ܵ��� : "+result+"�� �Դϴ�.");
		}
		else if(input == 2) {
			int result = money-500;
			System.out.println("�ܵ��� : "+result+"�� �Դϴ�.");
		}
		else if(input == 3) {
			int result = money-1500;
			System.out.println("�ܵ��� : "+result+"�� �Դϴ�.");
		}
		else {
			System.out.println("�ܵ��� �����ϴ�.");
		}
		*/
		 
	}

}
