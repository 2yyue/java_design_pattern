package com.fatey.liu.structural._10_decorator.demo01;

/**
 * @author Liu Fatey
 */
public class Airplane extends Changer {
	public Airplane(Transform transform) {
		super(transform);
		System.out.println("变身成飞机形态");
	}

	public void fly() {
		System.out.println("飞机飞翔");
	}
}
