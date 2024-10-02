package com.fatey.liu.creational._02_factory_method.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/9/29 下午12:34
 */
public class CashPay implements Pay {
	
	@Override
	public void getPay() {
		System.out.println("正在使用现金支付。。。。");
	}
}
