package gcloud.kdt.exception;

public class TryTest {

//���� ó���� ���� ������ ���� ������ ������ �߻�
//1. DB ����
//2. Networking
//3. I/O : �ϵ��ũ���� ���� �о����
//4. ������
	
	public void test(int num) {
		try {
			int result = 4/num;
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("��Ʈ��ũ�� �������� �ʽ��ϴ�. �ٽ� �õ����ּ���.");
		}finally {
			System.out.println("�� �ڵ�� ���� �߻� ������ ������� ����˴ϴ�.");
		}
	}
	
}
