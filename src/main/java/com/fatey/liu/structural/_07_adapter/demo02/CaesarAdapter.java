package com.fatey.liu.structural._07_adapter.demo02;

/**
 * @author Liu Fatey
 */
public class CaesarAdapter extends DataOperation {
	private Caesar caesar;

	public CaesarAdapter() {
		caesar = new Caesar();
	}

	@Override
	public String doEncrypt(int key, String ps) {
		return caesar.doEncrypt(key, ps);
	}
}
