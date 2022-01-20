package gcloud.kdt.exam1;

import java.util.Random;

public class ScissorRockPaper implements Game{
	
	int me;

	@Override
	public int startGame(int you) {
		//result ���� 1�̸� win
		//result ���� 0�̸� lose
		//result ���� -1�̸� same
		int result =Game.SAME;
		Random rd = new Random();
		me = rd.nextInt(3)+1;
		
		switch((""+me)+(""+you)) {
			case "12":
				result=Game.WIN;
				break;
			case "13":
				result=Game.LOSE;
				break;
			case "21":
				result=Game.LOSE;
				break;
			case "23":
				result=Game.WIN;
				break;
			case "31":
				result=Game.WIN;
				break;
			case "32":
				result=Game.LOSE;
				break;
			default :
			    result=Game.SAME;
			    break;
		}
		return result;
	}
	
	public String getType(int idx) {

		String result = ""; 
		
		switch (idx) {
		case Game.SCISSOR:
			result = "����";
			break;
		case Game.ROCK:
			result = "����";
			break;
		case Game.PAPER:
			result = "��";
			break;
		default:
			result = "?";
			break;
		}
		
		return result;
	}
	
	public String getResult(int idx) {
		String result = ""; 
		
		switch (idx) {
		case Game.WIN:
			result = "win";
			break;
		case Game.LOSE:
			result = "lose";
			break;
		case Game.SAME:
			result = "same";
			break;
		default:
			result = "?";
			break;
		}
		
		return result;

	}
	
	
	
	
	
	
	
	
	
	
	

}
