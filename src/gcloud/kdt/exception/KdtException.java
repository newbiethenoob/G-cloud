package gcloud.kdt.exception;

public class KdtException extends Exception{

	public KdtException(Exception e) {
		//������Ʈ���� �߻��ϴ� ���ܸ� ��� �޾Ƽ� ������ ������ ���� ���� ó���ϴ� �ڵ带 ������ ��
		System.out.println("KdtException���� error�� ó���մϴ�." + e.getMessage());
	}
}
