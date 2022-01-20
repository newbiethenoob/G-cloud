package gcloud.kdt.korea;

import java.util.Iterator;

public class ForTest {
	public void test(){		
		//		double x=3.0;
		//		float y=3.0f;
		
		//		int result=0;
		//		for(초기값; 조건 ; 증감값) {
		//		for(int i=1;i<=10;i++) {
		//			result= result+i;
		//			System.out.println(result);
		//		}
		//		
		//		System.out.println("최종 값은 : " +result);

		//		for (int i = 1; i < 10; i++) {
		//			for (int j = 1; j < 10; j++) {
		//				System.out.print(i+"*"+j+"="+i*j +"  ");
		//			}
		//			
		//			System.out.println();
		//		}

		//		while(조건) {
		//			코드		
		//		}
		//		int i=1;
		//		while(true) {			
		//			if( i<10) {
		//				System.out.println(i);
		//				i++;
		//			}else {
		//				break;
		//			}
		//		}

		//		while(i<10) {	
		//			System.out.println(i);
		//			i++;
		//
		//		}
		
		int i=1;
		int j=1;
		while(i<=9){
			while(j<=9){
				System.out.print(i+"*"+j+"="+i*j+" ");
				j++;//j=j+2; j+=2;
				
			}
			System.out.println();
			j=1;
			i++;
		}	

		//		for(int i=1;i<6;i++){
		//			for(int j=1;j<=i;j++){				
		//				System.out.print("★");				
		//			}
		//			System.out.println();
		//		}	


		//			for(int i=1;i<6;i++){// for(int i=6;i>0;i--)
		//				for(int j=1;j<6;j++){
		//					if(j<=i){
		//						System.out.print("★");
		//					}else {
		//						System.out.print("☆");
		//					}					
		//				}
		//				System.out.println();
		//			}	

		//		for(int i=1;i<6;i++){
		//			for(int j=1;j<6;j++){
		//				if(i+j>=6){
		//					System.out.print("★");	
		//				}else{
		//					System.out.print("☆");
		//				}
		//			}
		//			System.out.println();
		//		}		
		//		
		//		System.out.println();
		//		System.out.println();
		//		System.out.println();
		//		
		//		for(int i=1;i<6;i++){
		//			for(int j=5;j>0;j--){
		//				if(i>=j){
		//					System.out.print("★");
		//				}else{
		//					System.out.print("☆");
		//				}
		//			}
		//			System.out.println();
		//		}	

		//		for(int i=5;i>0;i--){
		//			for(int j=5;i+j>=6;j--){				
		//				System.out.print("★");				
		//			}
		//			System.out.println();
		//		}	

		//		
		//		for(int i=1;i<10;i++){
		//			for(int j=1;j<10;j++){
		//				if(i+j==6 || i+j==14|| j-i==4 || i-j==4 ){
		//					System.out.print("★");
		//				}else{
		//					System.out.print("☆");
		//				}
		//			}
		//			System.out.println();
		//		}	

	}

}













