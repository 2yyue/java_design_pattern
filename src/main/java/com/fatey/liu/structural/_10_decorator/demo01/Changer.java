package com.fatey.liu.structural._10_decorator.demo01;

/**
 * @author Liu Fatey
 */
public class Changer implements Transform {

	private Transform transform;

	public Changer(Transform transform) {
		this.transform = transform;
	}

	@Override
	public void move() {
		transform.move();
	}
}
