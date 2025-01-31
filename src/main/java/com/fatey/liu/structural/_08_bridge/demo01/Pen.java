package com.fatey.liu.structural._08_bridge.demo01;

/**
 * @author Liu Fatey
 */
public abstract class Pen {
	protected Color color;

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw(String name);
}
