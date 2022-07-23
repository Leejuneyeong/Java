package 자바페스티벌;

public class Ex_13 {

	public static void main(String[] args) {
		String score ="A,A,B,C,D,A,C,D,D,D,F";
		int Asum=0;
		int Bsum=0;
		int Csum=0;
		int Dsum=0;
		int Fsum=0;
		for(int i=0;i<score.length();i++) {
			if(score.charAt(i)=='A') {
				Asum+=1;
			}else if(score.charAt(i)=='B') {
				Bsum+=1;
			}else if(score.charAt(i)=='C') {
				Csum+=1;
			}else if(score.charAt(i)=='D') {
				Dsum+=1;
			}else if(score.charAt(i)=='F'){
				Fsum+=1;
			}
		}
		System.out.println("A : "+Asum);
		System.out.println("B : "+Bsum);
		System.out.println("C : "+Csum);
		System.out.println("D : "+Dsum);
		System.out.println("F : "+Fsum);
	}

}
