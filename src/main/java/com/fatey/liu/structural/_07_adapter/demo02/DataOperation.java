package com.fatey.liu.structural._07_adapter.demo02;

/**
 * @author Liu Fatey
 */
public abstract class DataOperation {
	private String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public abstract String doEncrypt(int key, String ps);
}
