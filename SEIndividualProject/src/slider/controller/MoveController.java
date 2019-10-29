package slider.controller;

import slider.boundary.SliderApp;

public class MoveController {

	static int moves = 0;
	
	public MoveController() {
		
	}
	
	public static int incrMoves() { return ++moves; }
	
	public static int resetMoves() {
		moves = 0;
		return moves;
	}
	
	public static int getMoves() { return moves; }
}
