package gcloud.kdt.exam1;

import java.util.Random;

public class ScissorRockPaperMain {

	public static void main(String[] args) {
		Random r = new Random();
	
		int you = r.nextInt(3)+1;
		
		ScissorRockPaper srp = new ScissorRockPaper();
		//result 값이 1이면 이김
		//result 값이 0이면 짐
		//result 값이 -1이면 비김
		
		int result = srp.startGame(you);

		System.out.println("나는 " + srp.getType(srp.me) + ", 당신은 " + srp.getType(you) + " 입니다. 따라서 당신이" + srp.getResult(result));
		
		you = r.nextInt(6)+1;
	}
}

