
public class Ex_08 {

	public static void main(String[] args) {
		
		int count = 1;
		int sum =0;
		for(int i=77;i>=1;i--) {
			//System.out.print("("+i+"*"+count+")"+"+");
			sum = sum+i*count;
			count++;
		}
		System.out.println("´ä: "+sum);
			
	}

}
