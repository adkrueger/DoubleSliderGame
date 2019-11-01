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
	
	
	public MoveController(Model panel, Tile tile, Puzzle puzzle) {	// TODO: need to pass a list of all tiles with new entity class object
		this.panel = panel;
		this.tile = tile;
		this.puzzle = puzzle;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Check if inside existing location
	
		String emptyID = puzzle.BC.findEmptyAdjacent(tile.getxyID());
		
		if(emptyID != null && !tile.getIsLocked()) {
			puzzle.BC.flip(tile, puzzle.BC.getTileByID(emptyID));
		}
	}
}
