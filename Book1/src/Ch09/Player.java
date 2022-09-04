package Ch09;

public class Player{
	private PlayerLevel level; //player가 가지는 변수 선언
	
	public Player() {//디폴트 생성자
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
