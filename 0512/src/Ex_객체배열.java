
public class Ex_��ü�迭 {

	public static void main(String[] args) {
		
		PocketMon mon1 = new PocketMon();
		mon1.setName("���̸�");
		mon1.setType("��");
		
		PocketMon mon2 = new PocketMon();
		mon2.setName("���α�");
		mon2.setType("��");
		
		PocketMon mon3 = new PocketMon();
		mon3.setName("��Ÿ��");
		mon3.setType("?");
		
		// ���� ����Ʈ�� �ƴ� ũ�Ⱑ ������ �迭��
		// ���ϸ� �����ϱ�!
		
		// ������ Ÿ��[] �迭�̸� = new ������ Ÿ��[ũ��];
		PocketMon[] pocket = new PocketMon[3];
		pocket[0]=mon1;
		pocket[1]=mon2;
		pocket[2]=mon3;
		
		for(int i=0;i<pocket.length;i++) {
			System.out.println(pocket[i].getName()+"/"+pocket[i].getType());
		}
		
	}

}
