package gcloud.kdt.korea;

public class ArrayTest {
	//	  1차원 배열 선언
	int[] full = {1,3,5,7,9};//int full[] = {1,3,5,7,9};
//	int[] full = new int[5];
//	int[] full = new int[]{1,3,5,7,9};

	//	  2차원 배열 선언
	int[][] human = new int[5][5];
	int[][] human1 = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] diff = new int[3][];
	
	//	2차원 배열의 크기가 다를때는 아래와 같이 선언해야 함
	public void diffArray(){
		diff[0] = new int[2];
		diff[1] = new int[4];
		diff[2] = new int[3];		
	}

//	public void test(){
////		for(int i=0; i<full.length;i++){
////			System.out.println(full[i]);
////		}	
//
//		//향상된 for문 사용
//		for(int i : full){
//			System.out.println(i);
//		}
//	}

	public void test1(){
		int value=1;
		for(int i=0;i<human.length;i++){
			for(int j=0;j<human[i].length;j++){
				human[i][j]=value;
				value++;
			}
		}

//		for(int i=0;i<human.length;i++){
//			for(int j=0;j<human[i].length;j++){
//				System.out.print(human[i][j]+"  ");				
//			}
//			System.out.println();
//		}

//		향상된 for문 사용
		for(int[] first:human) {
			for( int result : first) {
				System.out.print(result + " ");
			}
			System.out.println();
		}		
	}

	
	
	
	
	
	
	
	
	
	
	
}
