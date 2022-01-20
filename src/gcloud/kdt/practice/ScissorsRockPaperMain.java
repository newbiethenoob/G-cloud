package gcloud.kdt.practice;

import java.util.Random;

public class ScissorsRockPaperMain {

	public int startGame(int me, int you) {

		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		int result;
		
		if(me == you) {
			result = 2;
		}else if(me==1 && you==2) {
			result = 1;
		}else if(me==2 && you==3) {		
			result = 1;
		}else if(me==3 && you==1) {
			result = 1;
		}else {
			result = 0;
		}
			
		
		return result;
	}
	
	private String getType(int you) {
		StringBuilder hand = new StringBuilder();
		if(you == 1) {
			hand.append("����");
		}else if(you == 2) {
			hand.append("����");
		}else {
			hand.append("��");
		}
		
		return hand.toString();
	}
	
	private String getResult(int result) {
		StringBuilder rs = new StringBuilder();
		if(result == 1) {
			rs.append("�̰���ϴ�.");
		}else if(result==2) {
			rs.append("�����ϴ�.");
		}else {
			rs.append("�����ϴ�.");
		}
		return rs.toString();
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int me = r.nextInt(3)+1;
		int you = r.nextInt(3)+1;
		
		ScissorsRockPaperMain srp = new ScissorsRockPaperMain();
		int result = srp.startGame(me, you);
		
		System.out.println(me+" "+you);
		System.out.println("���� " + srp.getType(me) + ", ����� " + srp.getType(you) + "�Դϴ�. ���� ����� " + srp.getResult(result));
		
		you = r.nextInt(6)+1;
	}





}
