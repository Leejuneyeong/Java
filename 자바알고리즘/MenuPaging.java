import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MenuPaging {

	public static void main(String[] args) throws IOException {
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st;
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<T;i++) {
    		st=new StringTokenizer(br.readLine());
    		
    		int m = Integer.parseInt(st.nextToken());

    		int n = Integer.parseInt(st.nextToken());
    		
    		if(n<1) {
    			System.out.println("종료합니다.");
    			break;
    		}else {
    			if(m%n==0) {
    				bw.write(m/n+"\n");
    			}else {
    			bw.write((m/n)+1+"\n");
    			}
    		}
    	}
    	bw.close();
    	
	}

}
