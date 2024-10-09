package com.fatey.liu.creational._05_prototype.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/8 下午8:36
 */
public class Application {
	public static void main(String[] args) {
		Email email, copy = null;
		email = new Email();
		try {
			copy = (Email) email.deepClone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(email == copy);
		System.out.println(email.getAttachment() == copy.getAttachment());
	}
}
