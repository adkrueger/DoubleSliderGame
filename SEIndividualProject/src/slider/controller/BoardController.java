package slider.controller;

import slider.boundary.Puzzle;
import slider.model.TileSet;

public class BoardController {

	Puzzle puzzle;
	TileSet tileSet;
	
	public BoardController(Puzzle puzzle, TileSet tileSet) {
		
		this.puzzle = puzzle;
		this.tileSet = tileSet;
		
	}
	
}
