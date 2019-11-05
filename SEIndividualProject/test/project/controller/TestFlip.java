package project.controller;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import project.GUITestCase;
import slider.boundary.Puzzle;
import slider.controller.BoardController;
import slider.model.Model;
import slider.model.SliderApp;
import slider.model.Tile;

public class TestFlip extends GUITestCase {

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
	
	public void testFlip() {
		
		assertEquals(BC.getEmptyID(), "20");
		
		assertEquals(BC.getTileByID("10").getBgColor(), Color.DARK_GRAY);
		assertEquals(BC.getTileByID("10").getFgColor(), Color.WHITE);
		assertEquals(BC.getTileByID("10").getValue(), "2");
		
		assertEquals(BC.getTileByID("20").getBgColor(), Color.ORANGE);
		assertEquals(BC.getTileByID("20").getFgColor(), Color.BLACK);
		assertEquals(BC.getTileByID("20").getValue(), " ");
		
		puzzle.MC_1.mousePressed(createPressed(puzzle, 400, 100));
		BC.flip(BC.getTileByID("10"), BC.getTileByID("20"));
		
		assertEquals(BC.getEmptyID(), "10");

		assertEquals(BC.getTileByID("10").getBgColor(), Color.ORANGE);
		assertEquals(BC.getTileByID("10").getFgColor(), Color.BLACK);
		assertEquals(BC.getTileByID("10").getValue(), " ");
		
		assertEquals(BC.getTileByID("20").getBgColor(), Color.LIGHT_GRAY);
		assertEquals(BC.getTileByID("20").getFgColor(), Color.BLACK);
		assertEquals(BC.getTileByID("20").getValue(), "3");
		
	}
	
}
