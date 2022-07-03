
public class Ex_객체배열 {

	public static void main(String[] args) {
		
		PocketMon mon1 = new PocketMon();
		mon1.setName("파이리");
		mon1.setType("불");
		
		PocketMon mon2 = new PocketMon();
		mon2.setName("꼬부기");
		mon2.setType("물");
		
		PocketMon mon3 = new PocketMon();
		mon3.setName("메타몽");
		mon3.setType("?");
		
		// 가변 리스트가 아닌 크기가 지정된 배열에
		// 포켓몬 정리하기!
		
		// 데이터 타입[] 배열이름 = new 데이터 타입[크기];
		PocketMon[] pocket = new PocketMon[3];
		pocket[0]=mon1;
		pocket[1]=mon2;
		pocket[2]=mon3;
		
		for(int i=0;i<pocket.length;i++) {
			System.out.println(pocket[i].getName()+"/"+pocket[i].getType());
		}
		
	}

}
