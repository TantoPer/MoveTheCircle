package TantoPer.MoveTheCircle;

public class MTC {

	private static Frame frame;

	public static void main(String[] args) {
		frame = new Frame(new MTC());
	}

	public void update() {
		// update gm -> update player points
		//frame.getCounter().setText("player.getPoints()");
		frame.getCounter().setText("1");	

	}
}
