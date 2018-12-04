package TantoPer.MoveTheCircle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagineLoader {
	
	private JLabel imgToView;
	private Icon img;
	
	public ImagineLoader(String imageName,JFrame frame) {
		img= new ImageIcon(getClass().getResource(imageName));
		imgToView = new JLabel(img);
		imgToView.setBounds(100,150, 50, 50);
		imgToView.setVisible(true);
		
	}

	public JLabel getImgToView() {
		return imgToView;
	}

	public void setImgToView(JLabel imgToView) {
		this.imgToView = imgToView;
	}

}
