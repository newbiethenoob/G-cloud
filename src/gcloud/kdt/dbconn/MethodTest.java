package gcloud.kdt.dbconn;

public class MethodTest {
//Ŭ������ ����(�ʵ�) + �޼ҵ�� ���� ---> �޼ҵ��� ���� ~~(){ }
	int i=9;; //Ÿ�� ������ = ��;
	
	public void test() {
		Receive rc = new Receive();
		//�޼ҵ��� �Ķ���ͷ� primitive Ÿ���� �Ѿ�� �� ��ü�� �����
		//������ �ʰ� �޴� ���� ���� �ٸ� ����
		rc.receive(i);
		System.out.println("�� ���� Test���� ��� " + i);
		
		
		TestValue tv = new TestValue();
		//�޼ҵ��� �Ķ���ͷ� reference Ÿ���� �Ѿ�� �ּҰ� �����
		//������ �ʰ� �޴� ���� ���� ���� �ּҸ� ������ �Ǿ �޷θ����� ���� ��ü��
		rc.receive1(tv);
		System.out.println(tv.result);
				
	}

}
