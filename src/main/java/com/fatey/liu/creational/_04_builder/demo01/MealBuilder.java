package com.fatey.liu.creational._04_builder.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午10:17
 */
public abstract class MealBuilder {
	protected Meal meal = new Meal();
	
	public abstract void buildFood();
	
	public abstract void buildDrink();
	
	public Meal getMeal() {
		return meal;
	}
	
}
