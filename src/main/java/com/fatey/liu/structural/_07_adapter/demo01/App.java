package com.fatey.liu.structural._07_adapter.demo01;

/**
 * @author Liu Fatey
 */
public class App {
	public static void main(String[] args) {
		Robot robot = new CatAdapter();
		robot.cry();
		robot.move();
	}
}
