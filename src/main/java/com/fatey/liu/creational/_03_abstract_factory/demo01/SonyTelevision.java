package com.fatey.liu.creational._03_abstract_factory.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午9:01
 */
public class SonyTelevision implements Television {
	@Override
	public void play() {
		System.out.println("看索尼电视ing.....");
	}
}
