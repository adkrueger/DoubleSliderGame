package slider.model;

import java.awt.Color;

public class Tile {

	final String xyID;

	Color bgColor;
	Color fgColor;
	boolean isLocked;
	String value;	
	
	public Tile(String xyID, Color bgColor, Color fgColor, boolean isLocked, String value) {
		this.xyID = xyID;
		this.bgColor = bgColor;
		this.fgColor = fgColor;
		this.isLocked = isLocked;
		this.value = value;
	}

	public String getxyID() {
		return xyID;
	}
	
	public void lock() {
		isLocked = true;
	}
	
	public void unlock() {
		isLocked = false;
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
	
	public boolean getIsLocked() {
		return isLocked;
	}
	
	public boolean equals(Tile t) {
		return xyID.equals(t.getxyID())
				&& bgColor.equals(t.getBgColor()) 
				&& fgColor.equals(t.getFgColor())
				&& value.equals(t.getValue());
	}
}
