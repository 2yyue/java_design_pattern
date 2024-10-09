package com.fatey.liu.creational._04_builder.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/8 下午4:30
 */
public class SubMealBuilderA extends MealBuilder {
	public void buildFood() {
		meal.setFood("鸡腿堡");
	}
	
	public void buildDrink() {
		meal.setDrink("可口可乐");
	}
}
