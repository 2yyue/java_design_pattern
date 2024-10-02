package com.fatey.liu.creational._01_simple_factory.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/9/28 上午1:32
 */
public enum PayEnum implements Pay {
	CASH() {
		@Override
		public void pay() {
			System.out.println("使用现金支付");
		}
	},
	CREDITCARD() {
		@Override
		public void pay() {
			System.out.println("使用信用卡支付");
		}
	},
	WEIXIN() {
		@Override
		public void pay() {
			System.out.println("使用微信支付");
		}
	},
	ALIPAY() {
		@Override
		public void pay() {
			System.out.println("使用支付宝支付");
		}
	};
}
