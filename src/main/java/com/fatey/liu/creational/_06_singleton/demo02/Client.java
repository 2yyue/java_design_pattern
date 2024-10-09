package com.fatey.liu.creational._06_singleton.demo02;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/10 上午12:32
 */
public class Client {
	public static void main(String[] args) {
		IdentityCardNo n1, n2;
		n1 = IdentityCardNo.getInstance();
		n2 = IdentityCardNo.getInstance();
		System.out.println(n1 == n2);
		String name1, name2;
		name1 = n1.getNo();
		name2 = n2.getNo();
		System.out.println(name1 + " " + name2);
		System.out.println(name1.equals(name2));
		System.out.println(name1 == name2);
	}
}
