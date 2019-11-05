package project.controller;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;

import project.GUITestCase;
import slider.boundary.Puzzle;
import slider.controller.BoardController;
import slider.model.Model;
import slider.model.SliderApp;
import slider.model.Tile;

public class TestWin extends GUITestCase {

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
		msgLabel = new JLabel(" ");
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
	
	public void testCheckWin() {
		
		SA.tile_00 = new Tile("00", Color.LIGHT_GRAY, Color.BLACK, false, "1");
		SA.tile_10 = new Tile("10", Color.LIGHT_GRAY, Color.BLACK, false, "2");
		SA.tile_20 = new Tile("20", Color.LIGHT_GRAY, Color.BLACK, false, "3");
		SA.tile_01 = new Tile("01", Color.DARK_GRAY, Color.WHITE, false, "4");
		SA.tile_11 = new Tile("11", Color.ORANGE, Color.BLACK, false, " ");
		SA.tile_21 = new Tile("21", Color.LIGHT_GRAY, Color.BLACK, false, "4");
		SA.tile_02 = new Tile("02", Color.DARK_GRAY, Color.WHITE, false, "3");
		SA.tile_12 = new Tile("12", Color.DARK_GRAY, Color.WHITE, false, "2");
		SA.tile_22 = new Tile("22", Color.DARK_GRAY, Color.WHITE, false, "1");
		
		// need to re-initialize our tiles because we changed them artificially
		BC.initVars(new Tile[]{SA.tile_00, SA.tile_10, SA.tile_20, SA.tile_01, SA.tile_11, 
				SA.tile_21, SA.tile_02, SA.tile_12, SA.tile_22}, 
		new Model[]{SA.panel_0, SA.panel_1, SA.panel_2, SA.panel_3, SA.panel_4, 
				SA.panel_5, SA.panel_6, SA.panel_7, SA.panel_8},
		"11", moveCtr, msgLabel);
		
		assertTrue(BC.checkWin());
		
	}
	
	public void testWinMessage() {
		
		// perform winning set of moves
		BC.flip(BC.getTileByID("10"), BC.getTileByID("20"));
		BC.flip(BC.getTileByID("11"), BC.getTileByID("10"));
		BC.flip(BC.getTileByID("01"), BC.getTileByID("11"));
		BC.flip(BC.getTileByID("02"), BC.getTileByID("01"));
		BC.flip(BC.getTileByID("12"), BC.getTileByID("02"));
		BC.flip(BC.getTileByID("11"), BC.getTileByID("12"));
		
		ArrayList<Tile> winningFormat = BC.getTileSet().getWinningFormat();
		
		for(Tile t : winningFormat) {
			assertEquals(BC.getTileByID(t.getxyID()).getBgColor(), t.getBgColor());
			assertEquals(BC.getTileByID(t.getxyID()).getFgColor(), t.getFgColor());
			
			// if the board is in a winning format, test the congratulatory message to make sure
			switch (t.getxyID()) {
			case "00":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "C");
				break;
			case "10":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "O");
				break;
			case "20":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "N");
				break;
			case "01":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "G");
				break;
			case "11":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "R");
				break;
			case "21":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "A");
				break;
			case "02":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "T");
				break;
			case "12":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "S");
				break;
			case "22":
				assertEquals(BC.getTileByID(t.getxyID()).getValue(), "!");
				break;
			default:
				break;
			}
		}
		
	}
	
}
