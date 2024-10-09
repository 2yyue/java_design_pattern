package com.fatey.liu.creational._05_prototype.demo01;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/8 下午8:22
 */
public class Email implements Cloneable {
	private Attachment attachment = null;
	
	Email() {
		this.attachment = new Attachment();
	}
	
	@Override
	public Email clone() {
		Email email = null;
		try {
			email = (Email) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		return email;
	}
	
	public Attachment getAttachment() {
		return this.attachment;
	}
	
	public void display() {
		System.out.println("查看邮件");
	}
}
