package com.fatey.liu.creational._06_singleton.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/9 下午3:17
 */
public class Application {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1 == singleton);
	}
}
