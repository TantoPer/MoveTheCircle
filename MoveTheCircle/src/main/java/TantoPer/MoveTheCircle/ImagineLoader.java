package TantoPer.MoveTheCircle;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImagineLoader {
	
	private Icon img;
	
	public ImagineLoader(String imageName) {
		img= new ImageIcon(getClass().getResource(imageName));
	}

	public Icon getImg() {
		return img;
	}

	public void setImg(Icon img) {
		this.img = img;
	}


}
