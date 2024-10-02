package com.fatey.liu.creational._01_simple_factory.demo04;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/9/29 上午1:37
 */
public class Application {
	public static void main(String[] args) {
		Animals cat = Animals.CAT;
		Animals dog = Animals.DOG;
		Animals mouse = Animals.MOUSE;
		cat.getInfo("Tom");
		cat.sound();
		cat.eat();
		
		dog.getInfo("Jerry");
		dog.sound();
		dog.eat();
		
		mouse.getInfo("Lily");
		mouse.sound();
		mouse.eat();
	}
}
