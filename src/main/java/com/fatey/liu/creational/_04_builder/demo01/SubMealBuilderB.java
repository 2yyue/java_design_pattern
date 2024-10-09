package com.fatey.liu.creational._04_builder.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/8 下午4:31
 */
public class SubMealBuilderB extends MealBuilder {
	public void buildFood() {
		meal.setFood("新奥尔良火枪堡");
	}
	
	public void buildDrink() {
		meal.setDrink("百事 可乐");
	}
}
