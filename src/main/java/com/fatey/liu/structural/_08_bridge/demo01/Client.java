package com.fatey.liu.structural._08_bridge.demo01;

/**
 * @author Liu Fatey
 */
public class Client {
	public static void main(String[] args) {
		Color color = new Green();
		Pen pen = new BigPen();
		pen.setColor(color);
		pen.draw("鲜花");
	}
}
