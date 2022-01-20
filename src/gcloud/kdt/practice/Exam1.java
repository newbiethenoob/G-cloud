package gcloud.kdt.practice;

import java.util.Random;

public class Exam1 {

	public void exam4() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public void exam5() {
		Random rd = new Random();

		int rand = rd.nextInt(8)+1;
			
		for(int i=1;i<=9;i++) {
				System.out.println(rand+"*"+i+" = "+rand*i);
		}
	}
	
	public void exam7() {
		Random random = new Random();
		
		int rand = random.nextInt(100)+1;
		
		if(rand%2 == 0) {
			System.out.println(rand+" : "+"Â¦¼ö");
		}else {
			System.out.println(rand+" : "+"È¦¼ö");
		}
	}
	
	public static void main(String[] args) {
		Exam1 ex1 = new Exam1();
		
		
		ex1.exam4();
		ex1.exam5();
		ex1.exam7();
	}
}
