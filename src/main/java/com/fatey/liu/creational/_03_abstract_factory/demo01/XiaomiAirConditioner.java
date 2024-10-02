package com.fatey.liu.creational._03_abstract_factory.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午9:04
 */
public class XiaomiAirConditioner implements AirConditioner {
	@Override
	public void cool() {
		System.out.println("小米空调制冷了.....");
	}
}
