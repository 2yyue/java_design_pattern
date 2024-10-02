package com.fatey.liu.creational._03_abstract_factory.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午9:58
 */
public class LinuxFactory implements KitFactory {
	@Override
	public Button createButton() {
		return new LinuxButton();
	}
	
	@Override
	public Text createText() {
		return new LinuxText();
	}
}
