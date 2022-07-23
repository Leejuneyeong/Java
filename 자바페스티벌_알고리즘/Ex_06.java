package 자바페스티벌;


public class Ex_06 {

	public static void main(String[] args) {
		
		int count = 1;
		int sum =0;
		for(int i=77;i>=1;i--) {
			//System.out.print("("+i+"*"+count+")"+"+");
			sum = sum+i*count;
			count++;
		}
		System.out.println("답: "+sum);
			
	}

}
