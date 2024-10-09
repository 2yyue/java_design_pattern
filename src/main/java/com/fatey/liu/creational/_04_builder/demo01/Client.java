package com.fatey.liu.creational._04_builder.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/8 下午4:35
 */
public class Client {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new SubMealBuilderA();
		KFCWaiter waiter = new KFCWaiter();
		waiter.setMealBuilder(mealBuilder);
		final Meal meal = waiter.construct();
		System.out.println(meal.getDrink());
		System.out.println(meal.getFood());
	}
}
