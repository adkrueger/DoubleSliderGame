package slider.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import slider.boundary.Puzzle;
import slider.model.Model;
import slider.model.Tile;

public class MoveController extends MouseAdapter {
	
	Model panel;
	Tile tile;
	Puzzle puzzle;
	
	
	public MoveController(Model panel, Tile tile, Puzzle puzzle) {
		this.panel = panel;
		this.tile = tile;
		this.puzzle = puzzle;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
	
		/*
		 * find the location of the adjacent empty tile;
		 * if it's not adjacent, emptyID will be null
		 */
		String emptyID = puzzle.BC.findEmptyAdjacent(tile.getxyID());

		
		if(emptyID != null && !tile.getIsLocked()) {	// only flip if the tile isn't adjacent to the empty tile or locked
			puzzle.BC.flip(tile, puzzle.BC.getTileByID(emptyID));
		}
	}
}
