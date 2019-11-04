package slider.model;

import java.awt.Color;
import javax.swing.JLabel;
import slider.model.Model;
import slider.model.Tile;


public class SliderApp {
	
	public Model panel_0, panel_1, panel_2, panel_3, panel_4, panel_5, panel_6, panel_7, panel_8;
	public JLabel label_0, label_1, label_2, label_3, label_4, label_5, label_6, label_7, label_8;
	public Tile tile_00, tile_10, tile_20, tile_01, tile_11, tile_21, tile_02, tile_12, tile_22;
	
	/**
	 * Create the frame.
	 */
	public SliderApp() {
				
		tile_00 = new Tile("00", Color.LIGHT_GRAY, Color.BLACK, false, "1");
		tile_10 = new Tile("10", Color.DARK_GRAY, Color.WHITE, false, "2");
		tile_20 = new Tile("20", Color.ORANGE, Color.BLACK, false, " ");
		tile_01 = new Tile("01", Color.DARK_GRAY, Color.WHITE, false, "2");
		tile_11 = new Tile("11", Color.DARK_GRAY, Color.WHITE, false, "3");
		tile_21 = new Tile("21", Color.LIGHT_GRAY, Color.BLACK, false, "4");
		tile_02 = new Tile("02", Color.LIGHT_GRAY, Color.BLACK, false, "1");
		tile_12 = new Tile("12", Color.LIGHT_GRAY, Color.BLACK, false, "2");
		tile_22 = new Tile("22", Color.DARK_GRAY, Color.WHITE, false, "1");

		label_0 = new JLabel(tile_00.getValue());
		label_1 = new JLabel(tile_10.getValue());
		label_2 = new JLabel(tile_20.getValue());
		label_3 = new JLabel(tile_01.getValue());
		label_4 = new JLabel(tile_11.getValue());
		label_5 = new JLabel(tile_21.getValue());
		label_6 = new JLabel(tile_02.getValue());
		label_7 = new JLabel(tile_12.getValue());
		label_8 = new JLabel(tile_22.getValue());

		panel_0 = new Model(tile_00, label_0);
		panel_1 = new Model(tile_10, label_1);
		panel_2 = new Model(tile_20, label_2);
		panel_3 = new Model(tile_01, label_3);
		panel_4 = new Model(tile_11, label_4);
		panel_5 = new Model(tile_21, label_5);
		panel_6 = new Model(tile_02, label_6);
		panel_7 = new Model(tile_12, label_7);
		panel_8 = new Model(tile_22, label_8);
		
	}
}
