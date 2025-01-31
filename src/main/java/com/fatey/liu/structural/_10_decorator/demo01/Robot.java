package com.fatey.liu.structural._10_decorator.demo01;

/**
 * @author Liu Fatey
 */
public class Robot extends Changer {
	public Robot(Transform transform) {
		super(transform);
		System.out.println("变身为汽车人形态");
	}

	public void say() {
		System.out.println("汽车人说话");
	}
}
