package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午7:01
 */
public class Pepsi extends Drink {
	@Override
	public String name() {
		return "百事可乐";
	}
	
	@Override
	public double price() {
		return 10.00;
	}
}
