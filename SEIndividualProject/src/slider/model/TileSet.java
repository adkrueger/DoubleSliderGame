package slider.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TileSet {

	String emptyTileID;
	
	Map<String, Tile> tileMap = new HashMap<>();	// so we can look up a tile by a given String, change colors etc.
	Map<Tile, Model> modelMap = new HashMap<>();
	Map<String, String[]> adjacents = new HashMap<>();
	
	public TileSet(Tile[] tiles, Model[] models, String emptyTileID) {
		
		for(int i = 0; i < tiles.length; i++) {
			System.out.println("putting " + tiles[i].getxyID());
			tileMap.put(tiles[i].getxyID(), tiles[i]);
			modelMap.put(tiles[i], models[i]);
		}

		for(Tile t : getTileMap().values()) {
			System.out.println(t.getxyID());
		}
		this.emptyTileID = emptyTileID;
		initAdjacents();
		
	}
	
	private void initAdjacents() {
		// use anonymous arrays so we can set up each Tile's adjacent neighbors
		adjacents.put("00", new String[]{"01", "10"});
		adjacents.put("10", new String[]{"00", "11", "20"});
		adjacents.put("20", new String[]{"10", "21"});
		adjacents.put("01", new String[]{"00", "02", "11"});
		adjacents.put("11", new String[]{"10", "01", "12", "21"});
		adjacents.put("21", new String[]{"20", "11", "22"});
		adjacents.put("02", new String[]{"01", "12"});
		adjacents.put("12", new String[]{"11", "02", "22"});
		adjacents.put("22", new String[]{"21", "12"});
		
	}
	
	public ArrayList<Tile> getWinningFormat() {
		
		ArrayList<Tile> winningFormat = new ArrayList<>();
		
		winningFormat.add(0, new Tile("00", Color.LIGHT_GRAY, Color.BLACK, false, "1"));
		winningFormat.add(1, new Tile("10", Color.LIGHT_GRAY, Color.BLACK, false, "2"));
		winningFormat.add(2, new Tile("20", Color.LIGHT_GRAY, Color.BLACK, false, "3"));
		winningFormat.add(3, new Tile("01", Color.DARK_GRAY, Color.WHITE, false, "4"));
		winningFormat.add(4, new Tile("11", Color.ORANGE, Color.BLACK, false, " "));
		winningFormat.add(5, new Tile("21", Color.LIGHT_GRAY, Color.BLACK, false, "4"));
		winningFormat.add(6, new Tile("02", Color.DARK_GRAY, Color.WHITE, false, "3"));
		winningFormat.add(7, new Tile("12", Color.DARK_GRAY, Color.WHITE, false, "2"));
		winningFormat.add(8, new Tile("22", Color.DARK_GRAY, Color.WHITE, false, "1"));
		
		return winningFormat;
		
	}
	
	public Map<String, Tile> getInitFormat() {
		
		Map<String, Tile> initFormat = new HashMap<>();
		
		initFormat.put("00", new Tile("00", Color.LIGHT_GRAY, Color.BLACK, false, "1"));
		initFormat.put("10", new Tile("10", Color.DARK_GRAY, Color.WHITE, false, "2"));
		initFormat.put("20", new Tile("20", Color.ORANGE, Color.BLACK, false, " "));
		initFormat.put("01", new Tile("01", Color.DARK_GRAY, Color.WHITE, false, "2"));
		initFormat.put("11", new Tile("11", Color.DARK_GRAY, Color.WHITE, false, "3"));
		initFormat.put("21", new Tile("21", Color.LIGHT_GRAY, Color.BLACK, false, "4"));
		initFormat.put("02", new Tile("02", Color.LIGHT_GRAY, Color.BLACK, false, "1"));
		initFormat.put("12", new Tile("12", Color.LIGHT_GRAY, Color.BLACK, false, "2"));
		initFormat.put("22", new Tile("22", Color.DARK_GRAY, Color.WHITE, false, "1"));
		
		return initFormat;
		
	}
	
	public void setEmptyTileID(String emptyTileID) {
		this.emptyTileID = emptyTileID;
	}
	
	public String getEmptyTileID() {
		return emptyTileID;
	}
	
	public Map<Tile, Model> getModels() {
		return modelMap;
	}
	
	public Model getModelByTile(Tile t) {
		return modelMap.get(t);
	}

	public Map<String, String[]> getAdjacents() {
		return adjacents;
	}
	
	public Map<String, Tile> getTileMap() {
		return tileMap;
	}
	
}
