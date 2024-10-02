package com.fatey.liu.creational._03_abstract_factory.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午9:55
 */
public class WindowsButton implements Button {
	@Override
	public void click() {
		System.out.println("点击了 Windows 按钮");
	}
	
	@Override
	public void display() {
		System.out.println("显示了 Windows 按钮");
	}
}
