package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午6:51
 */
public interface Item {
	String name();
	
	Packing packing();
	
	double price();
}
