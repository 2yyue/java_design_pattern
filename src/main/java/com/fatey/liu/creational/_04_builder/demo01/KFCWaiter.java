package com.fatey.liu.creational._04_builder.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/8 下午4:32
 */
public class KFCWaiter {
	private MealBuilder mealBuilder;
	
	public void setMealBuilder(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}
	
	public Meal construct() {
		mealBuilder.buildFood();
		mealBuilder.buildDrink();
		return mealBuilder.getMeal();
	}
}
