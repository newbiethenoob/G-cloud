package gcloud.kdt.inter;

public class Radio extends Elec {

	@Override//�ֳ����̼�
	public void volumeUp() {
		System.out.println("Radio�� �������Դϴ�");
	}

	@Override//�޼ҵ� �������̵�(overriding)
	public void volumeDown() {
		System.out.println("Radio�� �����ٿ��Դϴ�");
	}

	
	
}
