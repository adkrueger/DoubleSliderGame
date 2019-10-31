package slider.controller;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import slider.boundary.Puzzle;
import slider.model.Model;
import slider.model.Tile;

public class MoveController extends MouseAdapter {

	int moves = 0;
	
	Model panel;
	Tile tile;
	Puzzle puzzle;
	
	
	public MoveController(Model panel, Tile tile, Puzzle puzzle) {	// TODO: need to pass a list of all tiles with new entity class object
		this.panel = panel;
		this.tile = tile;
		this.puzzle = puzzle;
	}
	
	public int incrMoves() { return ++moves; }
	
	public int resetMoves() {
		moves = 0;
		return moves;
	}
	
	public int getMoves() { return moves; }
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Check if inside existing location
		Point p = me.getPoint();
		
		String emptyID = puzzle.BC.findEmptyAdjacent(tile.getxyID());
		
		if(emptyID != null) {
			puzzle.BC.flip(tile, puzzle.BC.getTileByID(emptyID));
		}
	}
}
