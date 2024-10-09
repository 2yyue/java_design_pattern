package com.fatey.liu.creational._06_singleton.demo01;

/**
 * @author Liu Fatey
 * @description 懒汉式
 * @created 2024/10/8 下午8:45
 */
public class Singleton {
	private static volatile Singleton instance = null;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
