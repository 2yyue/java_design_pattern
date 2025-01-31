package com.fatey.liu.structural._07_adapter.demo02;

/**
 * @author Liu Fatey
 */
public class App {
	public static void main(String[] args) {
		DataOperation dataOperation = new CipherAdapter();
		dataOperation.setPassword("LiuSunflower");
		String ps = dataOperation.getPassword();
		String es = dataOperation.doEncrypt(3, ps);
		System.out.println(ps + " " + es);
	}
}
