package com.fatey.liu.creational._05_prototype.demo02;

import java.io.*;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/8 下午8:30
 */
public class Email implements Serializable {
	private Attachment attachment = null;
	
	public Email() {
		this.attachment = new Attachment();
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
		// 将对象写入流中
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		// 将对象从流中取出
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		return (objectInputStream.readObject());
	}
	
	public Attachment getAttachment() {
		return this.attachment;
	}
	
	public void display() {
		System.out.println("查看邮件");
	}
}
