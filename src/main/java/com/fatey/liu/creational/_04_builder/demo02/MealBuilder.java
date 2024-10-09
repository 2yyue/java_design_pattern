package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午10:17
 */
public class MealBuilder {
	public Meal prepareMeal1() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareMeal2() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
