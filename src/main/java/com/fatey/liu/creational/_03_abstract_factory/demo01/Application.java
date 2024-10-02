package com.fatey.liu.creational._03_abstract_factory.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午9:08
 */
public class Application {
	public static void main(String[] args) {
		EFactory eFactory = new XiaomiFactory();
		Television television = eFactory.produceTelevision();
		television.play();
		AirConditioner airConditioner = eFactory.produceAirConditioner();
		airConditioner.cool();
	}
}
