package gcloud.kdt.korea;

public class Mabang {	
	int num=5;
	
	static int result =10;
	
	//final�� �����տ� ����Ǹ� ����� �Ǿ ���� ������ �� ����
	final double pi =3.14;
	//final�� �޼ҵ� �տ� ����Ǹ� �ش� �޼ҵ带 overriding �� �� ����
	//final�� Ŭ���� �տ� ����Ǹ� �ش� Ŭ������ ��ӹ��� �� ����
	
	
	public Mabang() {
		
	}		
	
	public Mabang(int num) {
		this.num=num;
		makeMabang();
//		pi=6.8;
	}
	
	
	public void makeMabang() {
		int[][] mabang = new int[num][num];	
			
		int x=0;
		int y= num/2;
		
		mabang[x][y]=1;
		
		for(int pos=2;pos<=num*num;pos++) {
//			2���� 25���� ���� �� �迭�� ��ġ(x, y��)�� ã�Ƴ�����
			
//			���� �밢�� ���� ���� �̵���
			x=x-1;
			y=y-1;
			
//			pos���� �� ��ġ�� ã�ƾ� �ϴµ� 4���� �������� üũ��
			
//			�迭�� �������� �̵��Ǵ� ���
			if(x<0) {
				if(y<0) {
					x=x+2;
					y=y+1;
				}else {
					x=x+num;
				}
			}else {
//				�迭�� �������� �̵��Ǵ� ���
				if(y<0){
					y=y+num;
				}else{
//					�迭�� ���� �ִ°��
					if(mabang[x][y]!=0) {
						x=x+2;
						y=y+1;
					}
				}
			}
			
			mabang[x][y] =pos;			
		}
		
		//�迭�� �� �ִ� ���� ����ϱ�
		for(int[] first : mabang) {
			for(int result: first) {
				System.out.print(result + "  ");
			}
			System.out.println();
		}
			
	}
	
//	static �޼ҵ�ȿ��� static ������ ��밡��
//	public static void test() {
//		num=7;
//		result =100;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
