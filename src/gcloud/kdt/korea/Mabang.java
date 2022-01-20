package gcloud.kdt.korea;

public class Mabang {	
	int num=5;
	
	static int result =10;
	
	//final이 변수앞에 선언되면 상수가 되어서 값을 변경할 수 없음
	final double pi =3.14;
	//final이 메소드 앞에 선언되면 해당 메소드를 overriding 할 수 없음
	//final이 클래스 앞에 선언되면 해당 클래스를 상속받을 수 없음
	
	
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
//			2부터 25까지 수가 들어갈 배열의 위치(x, y값)을 찾아내야함
			
//			왼쪽 대각선 위로 먼저 이동함
			x=x-1;
			y=y-1;
			
//			pos값이 들어갈 위치를 찾아야 하는데 4가지 조건으로 체크함
			
//			배열의 위쪽으로 이동되는 경우
			if(x<0) {
				if(y<0) {
					x=x+2;
					y=y+1;
				}else {
					x=x+num;
				}
			}else {
//				배열의 왼쪽으로 이동되는 경우
				if(y<0){
					y=y+num;
				}else{
//					배열에 값이 있는경우
					if(mabang[x][y]!=0) {
						x=x+2;
						y=y+1;
					}
				}
			}
			
			mabang[x][y] =pos;			
		}
		
		//배열에 들어가 있는 값을 출력하기
		for(int[] first : mabang) {
			for(int result: first) {
				System.out.print(result + "  ");
			}
			System.out.println();
		}
			
	}
	
//	static 메소드안에는 static 변수만 사용가능
//	public static void test() {
//		num=7;
//		result =100;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
