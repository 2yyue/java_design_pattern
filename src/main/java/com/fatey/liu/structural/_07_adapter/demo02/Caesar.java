package com.fatey.liu.structural._07_adapter.demo02;

/**
 * @author Liu Fatey
 */
public final class Caesar {
	public String doEncrypt(int key, String ps) {
		String es = "";
		for(int i = 0; i < ps.length(); i++) {
			char c = ps.charAt(i);
			if(c >= 'a' && c <= 'z') {
				c += (char) (key % 26);
				if(c > 'z') {
					c -= 26;
				}
				if(c < 'a') {
					c += 26;
				}
			}
			if(c >= 'A' && c <= 'Z') {
				c += (char) (key % 26);
				if(c > 'Z') {
					c -= 26;
				}
				if(c < 'A') {
					c += 26;
				}
				es += c;
			}
		}
		return es;
	}
}
