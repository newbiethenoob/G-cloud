package gcloud.kdt.exam1;

import java.util.Random;

public class ScissorRockPaperMain {

	public static void main(String[] args) {
		Random r = new Random();
	
		int you = r.nextInt(3)+1;
		
		ScissorRockPaper srp = new ScissorRockPaper();
		//result ���� 1�̸� �̱�
		//result ���� 0�̸� ��
		//result ���� -1�̸� ���
		
		int result = srp.startGame(you);

		System.out.println("���� " + srp.getType(srp.me) + ", ����� " + srp.getType(you) + " �Դϴ�. ���� �����" + srp.getResult(result));
		
		you = r.nextInt(6)+1;
	}
}

