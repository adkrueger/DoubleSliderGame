package slider.model;

import java.awt.Color;

public class Tile {

	final String xyID;

	Color bgColor;
	Color fgColor;
	boolean isEmpty;
	String value;	
	
	public Tile(String xyID, Color bgColor, Color fgColor, boolean isEmpty, String value) {
		this.xyID = xyID;
		this.bgColor = bgColor;
		this.fgColor = fgColor;
		this.isEmpty = isEmpty;
		this.value = value;
	}

	public String getxyID() {
		return xyID;
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
	
}
