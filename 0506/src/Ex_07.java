
public class Ex_07 {

	public static void main(String[] args) {
		
		// int[�� ����][ȣ ����]
		// int[2][4] -> 2���� ��, �� ���� 4���� ���� ����
		
		int[][] arr = new int[2][4];
		
		arr[0][0] =1;
		arr[0][1] =2;
		arr[0][2] =3;
		arr[0][3] =4;
				
		arr[1][0] =5;
		arr[1][1] =6;
		arr[1][2] =7;
	    arr[1][3] =8;
	    
	    //���� �ݺ� ��Ű�� ���� �ݺ���
	    for(int i=0;i<arr.length;i++) {
	    	//System.out.println(arr[i]);
	    	// ���� ���� ȣ���� �ݺ� ��Ű�� ���� �ݺ���
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
	    //arr.length : ���� ���� ���̸� �������� ����
	    //arr[?].length : �ش� ���� ���� ���̸� �������� ����
	}

}
