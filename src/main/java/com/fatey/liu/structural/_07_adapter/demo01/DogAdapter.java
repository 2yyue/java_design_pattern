package com.fatey.liu.structural._07_adapter.demo01;

/**
 * @author Liu Fatey
 */
public class DogAdapter extends Dog implements Robot {
	@Override
	public void cry() {
		System.out.print("机器人适应狗叫：");
		super.sound();
	}

	@Override
	public void move() {
		System.out.print("机器人适应狗跑：");
		super.run();
	}
}
