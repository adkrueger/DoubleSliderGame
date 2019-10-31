package slider.controller;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import slider.model.Model;
import slider.model.Tile;

public class MoveController extends MouseAdapter {

	int moves = 0;
	Model panel;
	Tile tile;
	
	
	public MoveController(Model panel, Tile tile) {
		this.panel = panel;
		this.tile = tile;
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
		String currVal;
		
		tile.setBgColor(Color.GREEN);

		tile.setFgColor(Color.CYAN);

		if(tile.getValue().equals(" ")) { 
			currVal = tile.getValue();
		}
		else {
			currVal = Integer.toString(5 - Integer.valueOf(tile.getValue()));
		}
		tile.setValue(currVal);
		// MAKE SURE TO REFRESH DISPLAY
		panel.redraw();
		//TODO: Create another controller that checks entire board (all tiles)
		// this will also repaint the whole board, i.e. moves as well

	}
}
