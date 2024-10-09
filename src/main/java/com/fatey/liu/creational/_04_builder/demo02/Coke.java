package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午7:00
 */
public class Coke extends Drink {
	@Override
	public String name() {
		return "可口可乐";
	}
	
	@Override
	public double price() {
		return 12.00;
	}
}
