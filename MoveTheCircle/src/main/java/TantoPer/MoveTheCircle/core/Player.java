package TantoPer.MoveTheCircle.core;

public class Player {

	private int points;

	public Player() {
		setPoints(0);
	}

	public void addPoints(int pointsToAdd) {
		this.setPoints(this.getPoints() + pointsToAdd);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
