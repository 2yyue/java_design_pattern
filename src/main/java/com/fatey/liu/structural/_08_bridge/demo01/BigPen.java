package com.fatey.liu.structural._08_bridge.demo01;

/**
 * @author Liu Fatey
 */
public class BigPen extends Pen {
	@Override
	public void draw(String name) {
		String penType = "大号毛笔绘制";
		this.color.bepaint(penType, name);
	}
}
