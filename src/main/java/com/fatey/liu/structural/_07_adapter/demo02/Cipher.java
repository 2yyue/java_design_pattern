package com.fatey.liu.structural._07_adapter.demo02;

/**
 * @author Liu Fatey
 */
public final class Cipher {
	public String doEncrypt(int key, String ps) {
		String es = "";
		for(int i = 0; i < ps.length(); i++) {
			String c = String.valueOf(ps.charAt(i) % key);
			es += c;
		}
		return es;
	}
}
