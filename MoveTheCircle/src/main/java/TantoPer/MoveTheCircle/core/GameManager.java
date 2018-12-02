package TantoPer.MoveTheCircle.core;

public class GameManager {
	
	public GameManager() {
	}
	
	public void update(Player player, int pointsToAdd) {
		player.addPoints(pointsToAdd);
	}
	
}
