package com.fatey.liu.creational._02_factory_method.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/9/29 下午12:37
 */
public class Client {
	public static void main(String[] args) {
		Pay pay = (new CashPayFactory()).getPay();
		pay.getPay();
	}
}
