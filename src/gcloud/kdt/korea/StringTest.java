package gcloud.kdt.korea;

public class StringTest {
	public static void main(String[] args) {	
//		==�� ��ü�� ������ ��, Object Ŭ������ equals()�� ��������
//		String Ŭ���� equals()�� �������̵� �Ǿ�����->���ڿ� �����				
		String aa = "��";
		String bb = "��";
		String cc = new String("��");
		String dd= bb;
		System.out.println(aa.equals(bb));
		System.out.println(aa.equals(cc));
		System.out.println(aa==bb);
		System.out.println(bb==cc);
		System.out.println(aa==cc);
		System.out.println(dd==bb);
		System.out.println(dd.equals(cc));
		
		StringBuilder sb = new StringBuilder("av");
		sb.append("����");
		sb.append("��������������");
		System.out.println(sb);
	}

}
