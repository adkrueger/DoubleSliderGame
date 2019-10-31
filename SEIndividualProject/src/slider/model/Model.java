package slider.model;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Model extends JPanel {

	Tile tile;
	JLabel label;
	
	public Model(Tile tile, JLabel label) {
		this.tile = tile;
		this.label = label;
	}
	
	public void redraw() {
		this.setBackground(tile.getBgColor());
		label.setForeground(tile.getFgColor());
		label.setText(tile.getValue());
	}
}
