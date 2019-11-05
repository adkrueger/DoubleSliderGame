package slider.controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JLabel;

import slider.boundary.Puzzle;
import slider.model.Model;
import slider.model.SliderApp;
import slider.model.Tile;
import slider.model.TileSet;

public class BoardController {

	int moves = 0;
	
	Puzzle puzzle;
	JLabel moveCtr, msgLabel;
	Tile[] tiles = new Tile[10];
	Model[] models = new Model[10];
	TileSet tileSet;
	
	public BoardController(Puzzle puzzle) {
		
		this.puzzle = puzzle;
		
	}
	
	public void initVars(Tile[] tiles, Model[] models, String emptyTile, JLabel moveCtr, JLabel msgLabel) {

		this.tiles = tiles;
		this.models = models;
		tileSet = new TileSet(this.tiles, this.models, emptyTile);
		this.moveCtr = moveCtr;
		this.msgLabel = msgLabel;
		
	}
	
	public SliderApp getSliderApp() {
		return new SliderApp();
	}
	
	public String getEmptyID() {
		return tileSet.getEmptyTileID();
	}
	
	public String findEmptyAdjacent(String currTile) {
		
		for(String xyID : tileSet.getAdjacents().get(currTile)) {
			if(xyID.equals(tileSet.getEmptyTileID())) {
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
		srcTile.setFgColor(Color.BLACK);	// set to arbitrary BLACK
		srcTile.setValue(" ");
		
		tileSet.setEmptyTileID(srcTile.getxyID());
		tileSet.getModelByTile(srcTile).redraw();
		tileSet.getModelByTile(destTile).redraw();
		
		moveCtr.setText("Moves: " + ++moves);
		msgLabel.setText("");		
		
		checkWinLoss();
		
	}
	
	public void resetBoard() {
		
		Map<Tile, Model> models = tileSet.getModels();
		Map<String, Tile> initFormat = tileSet.getInitFormat();
		
		for(Tile t : models.keySet()) {
			String currXY = t.getxyID();
			t.setBgColor(initFormat.get(currXY).getBgColor());
			t.setFgColor(initFormat.get(currXY).getFgColor());
			t.setValue(initFormat.get(currXY).getValue());
			models.get(t).redraw();
		}
		
		tileSet.setEmptyTileID("20");
		
		msgLabel.setText("Board reset!");
		
		unlockBoard();
		
	}
	
	private void checkWinLoss() {
		if(checkLoss()) {
			msgLabel.setText("Loss! Hit reset.");
			lockBoard();
		}
		else if(checkWin()) {
			msgLabel.setText("You win!");
			lockBoard();
			createCongratulatoryMessage();
		}
	}
	
	private void lockBoard() {
		
		for(Tile t : tileSet.getTileMap().values()) {
			t.lock();
		}
		
	}
	
	private void unlockBoard() {
		
		for(Tile t : tileSet.getTileMap().values()) {
			t.unlock();
		}
		
	}
	
	private void createCongratulatoryMessage() {
		
		Map<Tile, Model> models = tileSet.getModels();	
				
		for(Tile t : models.keySet()) {
			switch (t.getxyID()) {
			case "00":
				t.setValue("C");
				models.get(t).redraw();
				break;
			case "10":
				t.setValue("O");
				models.get(t).redraw();
				break;
			case "20":
				t.setValue("N");
				models.get(t).redraw();
				break;
			case "01":
				t.setValue("G");
				models.get(t).redraw();
				break;
			case "11":
				t.setValue("R");
				models.get(t).redraw();
				break;
			case "21":
				t.setValue("A");
				models.get(t).redraw();
				break;
			case "02":
				t.setValue("T");
				models.get(t).redraw();
				break;
			case "12":
				t.setValue("S");
				models.get(t).redraw();
				break;
			case "22":
				t.setValue("!");
				models.get(t).redraw();
				break;
			default:
				break;
			}
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
	
	public boolean checkWin() {
		
		ArrayList<Tile> winningFormat = tileSet.getWinningFormat();
		Map<String, Tile> tileMap = tileSet.getTileMap();
		
		for(Tile t : winningFormat) {
			if(!tileMap.get(t.getxyID()).equals(t)) {	// if the Tile doesn't match what it should be in the winning format
				return false;
			}
		}
		
		return true;
		
	}
	
	public TileSet getTileSet() {
		return tileSet;
	}
	
}
