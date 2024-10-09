package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午6:59
 */
public class VegBurger extends Burger {
	@Override
	public String name() {
		return "蔬菜汉堡";
	}
	
	@Override
	public double price() {
		return 25.00;
	}
}
