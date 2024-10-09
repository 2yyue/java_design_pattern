package com.fatey.liu.creational._04_builder.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/7 下午7:08
 */
public class Application {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal1 = mealBuilder.prepareMeal1();
		Meal meal2 = mealBuilder.prepareMeal2();
		System.out.print("套餐1：");
		meal1.showItems();
		System.out.println("费用：" + meal1.getCost());
		System.out.print("套餐2：");
		meal2.showItems();
		System.out.println("费用：" + meal2.getCost());
	}
}
