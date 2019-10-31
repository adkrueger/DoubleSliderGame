package slider.controller;

import java.awt.Color;
import java.util.ArrayList;

import slider.boundary.Puzzle;
import slider.model.Model;
import slider.model.Tile;
import slider.model.TileSet;

public class BoardController {

	Puzzle puzzle;
	Tile[] tiles = new Tile[10];
	Model[] models = new Model[10];
	TileSet tileSet;
	
	public BoardController(Puzzle puzzle, Tile[] tiles, Model[] models, String emptyTile) {
		
		this.puzzle = puzzle;
		this.tiles = tiles;
		this.models = models;
		tileSet = new TileSet(this.tiles, this.models, emptyTile);
		
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
		
	}
	
}
