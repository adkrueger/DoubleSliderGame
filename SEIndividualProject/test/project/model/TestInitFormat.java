package project.model;

import java.awt.Font;
import java.util.Map;

import javax.swing.JLabel;

import junit.framework.TestCase;
import slider.boundary.Puzzle;
import slider.controller.BoardController;
import slider.model.Model;
import slider.model.SliderApp;
import slider.model.Tile;

public class TestInitFormat extends TestCase {
	
	Puzzle puzzle;
	BoardController BC;
	SliderApp SA;
	JLabel moveCtr;
	JLabel msgLabel;
	
	@Override
	protected void setUp() {
		
		puzzle = new Puzzle();
		BC = new BoardController(puzzle);
		SA = BC.getSliderApp();		
		moveCtr = new JLabel("Moves: 0");
		moveCtr.setFont(new Font("Calibri", Font.BOLD, 30));
		
		msgLabel = new JLabel(" ");
		msgLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		BC.initVars(new Tile[]{SA.tile_00, SA.tile_10, SA.tile_20, SA.tile_01, SA.tile_11, 
						SA.tile_21, SA.tile_02, SA.tile_12, SA.tile_22}, 
				new Model[]{SA.panel_0, SA.panel_1, SA.panel_2, SA.panel_3, SA.panel_4, 
						SA.panel_5, SA.panel_6, SA.panel_7, SA.panel_8},
				"20", moveCtr, msgLabel);
		
	}
	
	@Override 
	protected void tearDown() {
		puzzle.dispose();
	}
	
	public void testInit() {
		
		Map<String, Tile> initFormat = BC.getTileSet().getInitFormat();
		
		assertTrue(SA.tile_00.equals(initFormat.get("00")));
		assertTrue(SA.tile_10.equals(initFormat.get("10")));
		assertTrue(SA.tile_20.equals(initFormat.get("20")));
		assertTrue(SA.tile_01.equals(initFormat.get("01")));
		assertTrue(SA.tile_11.equals(initFormat.get("11")));
		assertTrue(SA.tile_21.equals(initFormat.get("21")));
		assertTrue(SA.tile_02.equals(initFormat.get("02")));
		assertTrue(SA.tile_12.equals(initFormat.get("12")));
		assertTrue(SA.tile_22.equals(initFormat.get("22")));
		
	}
	
}
