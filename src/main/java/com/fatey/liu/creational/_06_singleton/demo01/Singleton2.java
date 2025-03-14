package com.fatey.liu.creational._06_singleton.demo01;

/**
 * @author Liu Fatey
 */

public class Singleton2 {
	private Singleton2() { }

	public static Singleton2 getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {
		private static final Singleton2 INSTANCE = new Singleton2();
	}
}
