package com.fatey.liu.creational._04_builder.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午7:02
 */
public class Meal {
	private List<Item> items = new ArrayList<>();
	
	void addItem(Item item) {
		items.add(item);
	}
	
	double getCost() {
		double sum = 0.00;
		for(Item item : items) {
			sum += item.price();
		}
		return sum;
	}
	
	void showItems() {
		for(Item item : items) {
			System.out.println(item.price() + "块钱的用" + item.packing().pack() + "打包的" + item.name());
		}
	}
}
