package com.fatey.liu.creational._03_abstract_factory.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午10:01
 */
public class UnixText implements Text {
	@Override
	public void show() {
		System.out.println("显示了 Unix 文本");
	}
	
	@Override
	public void edit() {
		System.out.println("编辑了 Unix 文本");
	}
}
