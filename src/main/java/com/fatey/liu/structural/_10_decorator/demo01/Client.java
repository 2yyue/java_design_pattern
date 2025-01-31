package com.fatey.liu.structural._10_decorator.demo01;

/**
 * @author Liu Fatey
 */
public class Client {
	public static void main(String[] args) {
		Transform camaro = new Car();
		camaro.move();
		System.out.println("-------------------------");
		Robot bumblebee = new Robot(camaro);
		bumblebee.move();
		bumblebee.say();
	}
}
