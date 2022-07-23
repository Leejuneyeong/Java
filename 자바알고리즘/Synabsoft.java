import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

public class Synabsoft {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("D:\\�ڵ�����\\name.txt",
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
			
				if(name[i].substring(0,1).equals("��")) {
					kimcount++;
				}
				if(name[i].substring(0,1).equals("��")) {
					leecount++;
				}
				if(name[i].equals("���翵")) {
					leejaeyeongcount++;
				}
				if(!names.contains(name[i])) {
	                names.add(name[i]);
				}
				
			}
			System.out.println("1�� �达�� �̾��� ���� ����ΰ��� ? ");
			System.out.println("�达 �� : " + kimcount);
			System.out.println("�̾� �� : " + leecount);
			System.out.println();
			System.out.println("2�� '���翵'�̶� �̸��� �� �� �ݺ��ǳ��� ? ");
			System.out.println("���翵 �� : "+leejaeyeongcount);
			System.out.println();
			System.out.println("3�� �ߺ��� ������ �̸��� ����ϼ���. : ");
			
			for(int i =0 ; i<names.size();i++) {
				System.out.print(names.get(i)+" ");
			}
			System.out.println();
			System.out.println();
			System.out.println("4�� �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���. : ");
			
			Collections.sort(names);
			
			for(int i =0 ; i<names.size();i++) {
				System.out.print(names.get(i)+" ");
			}
			
		}
		reader.close();

	}

}
