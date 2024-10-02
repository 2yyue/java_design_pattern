package com.fatey.liu.creational._03_abstract_factory.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/2 下午10:02
 */
public class Client {
	public static void main(String[] args) {
		KitFactory kitFactory = new WindowsFacotry();
		Button btn = kitFactory.createButton();
		btn.click();
		btn.display();
		Text txt = kitFactory.createText();
		txt.edit();
		txt.show();
	}
}
