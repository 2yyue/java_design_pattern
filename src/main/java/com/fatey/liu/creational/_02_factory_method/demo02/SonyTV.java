package com.fatey.liu.creational._02_factory_method.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午5:48
 */
public class SonyTV implements TV {
	@Override
	public void play() {
		System.out.println("SonyTV正在播放。。。。");
	}
}
