package gcloud.kdt.korea;

import java.util.Random;

public class Lotto {
	
	private Random rd = new Random();
	private int[] lotto= new int[6];
	
	public void makeLotto() {
		lotto[0]= rd.nextInt(45)+1;
		
		for(int i=1;i<6;i++) {
			int temp = rd.nextInt(45)+1;
			lotto[i]=temp;
			for(int j=0; j<i; j++){                                                          
				if(lotto[j]==temp){
					i--;
				}				
			}	
		}
		
		for(int value: lotto){
			System.out.print("["+value+ "]");				
		}		
	}

}
