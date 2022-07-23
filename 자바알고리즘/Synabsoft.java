import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

public class Synabsoft {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("D:\\코딩파일\\name.txt",
				Charset.forName("UTF-8")));

		String str;
		
		ArrayList<String> names = new ArrayList<String>();
		
		int kimcount=0;
		int leecount=0;
		int leejaeyeongcount=0;
		
		while ((str = reader.readLine()) != null) {
	
			System.out.println(str);
			System.out.println("--------------------------------------"
					+ "-------------------------------------"
					+ "----------------------------------");
	
			String[] name= str.split(",");
			
			for(int i=0;i<name.length;i++) {
			
				if(name[i].substring(0,1).equals("김")) {
					kimcount++;
				}
				if(name[i].substring(0,1).equals("이")) {
					leecount++;
				}
				if(name[i].equals("이재영")) {
					leejaeyeongcount++;
				}
				if(!names.contains(name[i])) {
	                names.add(name[i]);
				}
				
			}
			System.out.println("1번 김씨와 이씨는 각각 몇명인가요 ? ");
			System.out.println("김씨 수 : " + kimcount);
			System.out.println("이씨 수 : " + leecount);
			System.out.println();
			System.out.println("2번 '이재영'이란 이름이 몇 번 반복되나요 ? ");
			System.out.println("이재영 씨 : "+leejaeyeongcount);
			System.out.println();
			System.out.println("3번 중복을 제거한 이름을 출력하세요. : ");
			
			for(int i =0 ; i<names.size();i++) {
				System.out.print(names.get(i)+" ");
			}
			System.out.println();
			System.out.println();
			System.out.println("4번 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요. : ");
			
			Collections.sort(names);
			
			for(int i =0 ; i<names.size();i++) {
				System.out.print(names.get(i)+" ");
			}
			
		}
		reader.close();

	}

}
