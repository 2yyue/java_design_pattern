package com.fatey.liu.creational._03_abstract_factory.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午9:07
 */
public class SonyFactory implements EFactory {
	@Override
	public Television produceTelevision() {
		return new SonyTelevision();
	}
	
	@Override
	public AirConditioner produceAirConditioner() {
		return new SonyAirConditioner();
	}
}
