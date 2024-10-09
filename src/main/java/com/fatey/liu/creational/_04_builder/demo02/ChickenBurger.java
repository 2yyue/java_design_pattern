package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午7:00
 */
public class ChickenBurger extends Burger {
	@Override
	public String name() {
		return "鸡肉汉堡";
	}
	
	@Override
	public double price() {
		return 35.00;
	}
}
