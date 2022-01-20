package gcloud.kdt.exam1;

public interface Game {

	int SCISSOR = 1;
	int ROCK = 2;
	int PAPER = 3;
	
	int WIN =1;
	int LOSE = 0;
	int SAME = -1;
	
	public int startGame(int you);
	public String getType(int idx);
	public String getResult(int idx);
	
}
