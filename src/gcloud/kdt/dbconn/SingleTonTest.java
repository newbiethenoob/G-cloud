package gcloud.kdt.dbconn;

public class SingleTonTest {
//	1. �̱��� ��ü�� �޸𸮿� 1���� �ν��Ͻ�ȭ �ؼ� ������
//	2. �ٸ� Ŭ�������� new �����ڸ� ����ؼ� �ν��Ͻ�ȭ �� �� ����
//	3. public �޼ҵ带 �̿��ؼ� �̽��Ͻ��� ���� �� ����
	
	static SingleTonTest stt = new SingleTonTest();
	
	private SingleTonTest() {
		
	}
	
	public static SingleTonTest getInstance() {
		if(stt == null) {
			stt = new SingleTonTest();
		}
		return stt;
	}

	public void test() {
		// TODO Auto-generated method stub
		
	}
}
