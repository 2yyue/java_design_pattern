package com.fatey.liu.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/4 下午9:31
 * aop完成
 */

public class TestController {
	@RepeatSubmit(name = "test")
	public static void main(String[] args) {
		RepeatSubmitHandler handler = new RepeatSubmitHandler();
		handler.rsHandler();
		System.out.println("开始启动。。。。");
	}
}
