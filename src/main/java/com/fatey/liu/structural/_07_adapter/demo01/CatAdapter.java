package com.fatey.liu.structural._07_adapter.demo01;

/**
 * @author Liu Fatey
 */
public class CatAdapter extends Cat implements Robot {
	@Override
	public void cry() {
		System.out.print("机器人模拟猫猫:");
		super.sound();
	}

	@Override
	public void move() {
		System.out.print("机器人模拟猫猫:");
		super.move();
	}
}
