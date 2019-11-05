package project.controller;

import java.awt.Font;

import javax.swing.JLabel;

import junit.framework.TestCase;
import slider.boundary.Puzzle;
import slider.controller.BoardController;
import slider.model.Model;
import slider.model.SliderApp;
import slider.model.Tile;

public class TestLocks extends TestCase {

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
	
	public void testWinLock() {
		
		BC.flip(BC.getTileByID("10"), BC.getTileByID("20"));
		BC.flip(BC.getTileByID("11"), BC.getTileByID("10"));
		BC.flip(BC.getTileByID("01"), BC.getTileByID("11"));
		BC.flip(BC.getTileByID("02"), BC.getTileByID("01"));
		BC.flip(BC.getTileByID("12"), BC.getTileByID("02"));
		BC.flip(BC.getTileByID("11"), BC.getTileByID("12"));
		
		for(Tile t : BC.getTileSet().getTileMap().values()) {
			assertTrue(t.getIsLocked());
		}
		
	}
	
	public void testLoseLock() {
		
		BC.flip(BC.getTileByID("21"), BC.getTileByID("20"));
		
		for(Tile t : BC.getTileSet().getTileMap().values()) {
			assertTrue(t.getIsLocked());
		}
		
	}
	
	public void testNotLockedAfterMove() {
		
		BC.flip(BC.getTileByID("10"), BC.getTileByID("20"));
		
		for(Tile t : BC.getTileSet().getTileMap().values()) {
			assertFalse(t.getIsLocked());
		}
		
		BC.flip(BC.getTileByID("00"), BC.getTileByID("10"));
		
		for(Tile t : BC.getTileSet().getTileMap().values()) {
			assertFalse(t.getIsLocked());
		}
		
	}
	
}
