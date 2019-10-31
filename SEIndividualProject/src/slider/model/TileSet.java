package slider.model;

import java.util.HashMap;
import java.util.Map;

public class TileSet {

	String emptyTileID;
	
	Map<String, Tile> tileMap = new HashMap<>();	// so we can look up a tile by a given String, change colors etc.
	Map<Tile, Model> modelMap = new HashMap<>();
	Map<String, String[]> adjacents = new HashMap<>();
	
	public TileSet(Tile[] tiles, Model[] models, String emptyTileID) {
		
		for(int i = 0; i < tiles.length; i++) {
			tileMap.put(tiles[i].getxyID(), tiles[i]);
			modelMap.put(tiles[i], models[i]);
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
	
	public void setEmptyTileID(String emptyTileID) {
		this.emptyTileID = emptyTileID;
	}
	
	public String getEmptyTileID() {
		return emptyTileID;
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
