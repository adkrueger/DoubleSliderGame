package slider.model;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Model extends JPanel {

	private static final long serialVersionUID = 1L;	// to satisfy warning

	Tile tile;
	JLabel label;
	
	/*
	 * Models contain the tile and its corresponding label
	 */
	public Model(Tile tile, JLabel label) {
		this.tile = tile;
		this.label = label;
	}
	
	/*
	 * if we need to redraw the background or value of a tile, like when a Tile is flipped
	 */
	public void redraw() {
		this.setBackground(tile.getBgColor());
		label.setForeground(tile.getFgColor());
		label.setText(tile.getValue());
	}
}
