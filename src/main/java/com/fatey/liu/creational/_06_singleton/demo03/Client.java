package com.fatey.liu.creational._06_singleton.demo03;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/10 上午12:41
 */
public class Client {
	public static void main(String[] args) {
		PrintSpoolerSingleton p1, p2;
		try {
			p1 = PrintSpoolerSingleton.getInstance();
			p1.manageJobs();
		} catch (PrintSpoolerException e) {
			e.printStackTrace();
		}
		try {
			p2 = PrintSpoolerSingleton.getInstance();
			p2.manageJobs();
		} catch (PrintSpoolerException e) {
			e.printStackTrace();
		}
	}
}
