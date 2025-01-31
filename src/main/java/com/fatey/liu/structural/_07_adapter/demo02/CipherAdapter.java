package com.fatey.liu.structural._07_adapter.demo02;

/**
 * @author Liu Fatey
 */
public class CipherAdapter extends DataOperation {
	private Cipher cipher;

	public CipherAdapter() {
		cipher = new Cipher();
	}

	@Override
	public String doEncrypt(int key, String ps) {
		return cipher.doEncrypt(key, ps);
	}
}
