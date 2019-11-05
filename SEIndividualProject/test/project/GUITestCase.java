package project;

import java.awt.Component;
import java.awt.event.MouseEvent;

import junit.framework.TestCase;

public abstract class GUITestCase extends TestCase {
	
	public MouseEvent createPressed (Component component, int x, int y) {
		return new MouseEvent(component, MouseEvent.MOUSE_PRESSED, 
								System.currentTimeMillis(), 0, x, y, 0, false);
	}
	
	public MouseEvent createReleased (Component component, int x, int y) {
		return new MouseEvent(component, MouseEvent.MOUSE_RELEASED, 
				System.currentTimeMillis(), 0, x, y, 0, false);
	}
	
}
