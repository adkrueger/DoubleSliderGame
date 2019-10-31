package slider.model;

import java.awt.Color;

public class Tile {
	
	final int xCoord;
	final int yCoord;
	
	Color bgColor;
	Color fgColor;
	String value;
	
	
	public Tile(int xCoord, int yCoord, Color bgColor, Color fgColor, String value) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.bgColor = bgColor;
		this.fgColor = fgColor;
		this.value = value;
	}
	
	public Color getBgColor() {
		return bgColor;
	}

	public void setBgColor(Color bgColor) {
		this.bgColor = bgColor;
	}

	public Color getFgColor() {
		return fgColor;
	}

	public void setFgColor(Color fgColor) {
		this.fgColor = fgColor;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getyCoord() {
		return yCoord;
	}

	public int getxCoord() {
		return xCoord;
	}
	
}
