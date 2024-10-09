package com.fatey.liu.creational._05_prototype.demo01;

/**
 * @author Liu Fatey
 * @description 浅克隆，复制对象，不复制成员对象。
 * @created 2024/10/8 下午8:26
 */
public class Application {
	public static void main(String[] args) {
		Email email, copyEmail;
		email = new Email();
		copyEmail = email.clone();
		System.out.println(email == copyEmail);
		System.out.println(email.getAttachment() == copyEmail.getAttachment());
	}
}
