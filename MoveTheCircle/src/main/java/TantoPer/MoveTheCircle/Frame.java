package TantoPer.MoveTheCircle;


import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame {
	private JLabel counter;
	private JFrame frame;
	private JLabel imgToView;
	private ImagineLoader img;

	public Frame(MTC mtc) {
		frame = new JFrame("Move the Cicle");
		frame.setSize(500, 400);
		Container myContainer = frame.getContentPane();
		myContainer.setLayout(null);
		
		createButton(frame, mtc);
		
		JLabel pointString = new JLabel();
		pointString.setText("Points:");
		pointString.setBounds(100,300,100,50);
		frame.add(pointString);
		
		counter = new JLabel();
		counter.setText("0");
		counter.setBounds(200,300,100,50);
		frame.add(counter);
		
		img = new ImagineLoader("circle.png");
		imgToView = new JLabel(img.getImg());
		imgToView.setBounds(100,150, 50, 50);
		frame.add(imgToView).setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void createButton(JFrame frame, MTC mtc) {
		JButton button = new JButton("click me!");
		button.setBounds(200,20,100,50);
		button.addMouseListener(new MouseEvent(mtc));
		frame.add(button);		
	}

	public void updateCounter(String text) {
		this.counter.setText(text);
	}

}
