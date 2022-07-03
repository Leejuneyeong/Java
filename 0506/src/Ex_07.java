
public class Ex_07 {

	public static void main(String[] args) {
		
		// int[층 갯수][호 갯수]
		// int[2][4] -> 2개의 층, 각 층에 4개의 방이 존재
		
		int[][] arr = new int[2][4];
		
		arr[0][0] =1;
		arr[0][1] =2;
		arr[0][2] =3;
		arr[0][3] =4;
				
		arr[1][0] =5;
		arr[1][1] =6;
		arr[1][2] =7;
	    arr[1][3] =8;
	    
	    //층을 반복 시키기 위한 반복문
	    for(int i=0;i<arr.length;i++) {
	    	//System.out.println(arr[i]);
	    	// 층에 대한 호수를 반복 시키기 위한 반복문
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
	    //arr.length : 층에 대한 길이를 가져오는 내용
	    //arr[?].length : 해당 층에 대한 길이를 가져오는 내용
	}

}
