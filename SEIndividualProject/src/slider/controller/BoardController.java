package slider.controller;

import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

import slider.boundary.Puzzle;
import slider.model.Model;
import slider.model.Tile;
import slider.model.TileSet;

public class BoardController {

	int moves = 0;
	
	Puzzle puzzle;
	JLabel moveCtr, msgLabel;
	Tile[] tiles = new Tile[10];
	Model[] models = new Model[10];
	TileSet tileSet;
	
	public BoardController(Puzzle puzzle, Tile[] tiles, Model[] models, String emptyTile, JLabel moveCtr, JLabel msgLabel) {
		
		this.puzzle = puzzle;
		this.tiles = tiles;
		this.models = models;
		tileSet = new TileSet(this.tiles, this.models, emptyTile);
		this.moveCtr = moveCtr;
		this.msgLabel = msgLabel;
		
	}
	
	public String getEmptyID() {
		return tileSet.getEmptyTileID();
	}
	
	public String findEmptyAdjacent(String currTile) {
		for(String xyID : tileSet.getAdjacents().get(currTile)) {
			if(xyID.equals(tileSet.getEmptyTileID())) {
				System.out.println(xyID);
				return xyID;
			}
		}
		
		return null;
		
	}
	
	public Tile getTileByID(String tileID) {
		return tileSet.getTileMap().get(tileID);
	}
	
	public int resetMoves() {
		moves = 0;
		return moves;
	}
	
	public int getMoves() { return moves; }
	
	public void flip(Tile srcTile, Tile destTile) {
		
		String currVal;
		
		if(srcTile.getBgColor().equals(Color.DARK_GRAY)) {	// need to flip background color
			destTile.setBgColor(Color.LIGHT_GRAY);
			destTile.setFgColor(Color.BLACK);
		}
		else {
			destTile.setBgColor(Color.DARK_GRAY);
			destTile.setFgColor(Color.WHITE);
		}
		
		if(srcTile.getValue().equals(" ")) { 
			currVal = srcTile.getValue();
		}
		else {
			currVal = Integer.toString(5 - Integer.valueOf(srcTile.getValue()));
		}
		
		destTile.setValue(currVal);
		
		srcTile.setBgColor(Color.ORANGE);
		srcTile.setFgColor(Color.WHITE);	// set to arbitrary white
		srcTile.setValue(" ");
		
		tileSet.setEmptyTileID(srcTile.getxyID());
		tileSet.getModelByTile(srcTile).redraw();
		tileSet.getModelByTile(destTile).redraw();

		moveCtr.setText("Moves: " + ++moves);
		
		checkWinLoss();
		
	}
	
	private void checkWinLoss() {
		if(checkLoss()) {
			System.out.println("LOSER");
			// TODO: Lock Board		(add a boolean isLocked field to Tile?)
			// TODO: Prompt Reset	(msgLabel)
		}
		else if (checkWin()) {
			System.out.println("WINNER");
			// TODO: Lock Board 	(maybe)
			// TODO: Congratulate Player
		}
	}
	
	private boolean checkLoss() {
		
		int[] amts = new int[4];	// an array to record the number of each value
		
		for(Tile t : tileSet.getTileMap().values()) {
			if(!t.getValue().equals(" ")) {	// if we're not looking at the empty space
				amts[Integer.valueOf(t.getValue()) - 1]++;
			}
		}
		
		for(int i : amts) {
			if(i >= 4) {
				return true;
			}
		}
		
		return false;
		
	}
	
	private boolean checkWin() {
		
		ArrayList<Tile> winningFormat = tileSet.getWinningFormat();
		Map<String, Tile> tileMap = tileSet.getTileMap();
		
		for(Tile t : winningFormat) {
			if(!tileMap.get(t.getxyID()).equals(t)) {	// if the Tile doesn't match what it should be in the winning format
				return false;
			}
		}
		
		return true;
		
	}
	
}
