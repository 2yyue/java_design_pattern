package com.fatey.liu.creational._02_factory_method.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午5:50
 */
public class Client {
	
	public static void main(String[] args) {
		TVFactory tvFactory = new SonyTVFactory();
		TV tv = tvFactory.produceTV();
		tv.play();
	}
}
