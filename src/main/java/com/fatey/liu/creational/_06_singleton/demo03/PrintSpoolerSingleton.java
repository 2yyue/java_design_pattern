package com.fatey.liu.creational._06_singleton.demo03;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/10 上午12:37
 */
public class PrintSpoolerSingleton {
	private static volatile PrintSpoolerSingleton instance = null;
	
	private PrintSpoolerSingleton() {}
	
	public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException {
		if(instance == null) {
			synchronized(PrintSpoolerSingleton.class) {
				if(instance == null) {
					System.out.println("初始化打印池");
					instance = new PrintSpoolerSingleton();
				}
				else {
					throw new PrintSpoolerException("打印池已投入使用。。");
				}
			}
		}
		else {
			throw new PrintSpoolerException("打印池已投入使用。。");
		}
		return instance;
	}
	
	public void manageJobs() {
		System.out.println("管理打印任务");
	}
}
