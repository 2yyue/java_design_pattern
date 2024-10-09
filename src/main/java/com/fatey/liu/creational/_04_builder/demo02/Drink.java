package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午6:57
 */
public abstract class Drink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract double price();
}
