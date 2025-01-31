package com.fatey.liu.structural._10_decorator.demo01;

/**
 * @author Liu Fatey
 */
public class Car implements Transform {
	public Car() {
		System.out.println("变形金刚汽车形态");
	}

	@Override
	public void move() {
		System.out.println("汽车移动");
	}
}
