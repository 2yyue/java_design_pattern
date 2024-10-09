package com.fatey.liu.creational._06_singleton.demo02;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/10 上午12:26
 */
@Getter
@Setter
public class IdentityCardNo {
	private static volatile IdentityCardNo instance = null;
	private String no;
	
	private IdentityCardNo() {
	
	}
	
	public static IdentityCardNo getInstance() {
		if(instance == null) {
			synchronized(IdentityCardNo.class) {
				if(instance == null) {
					System.out.println("初始化身份证号");
					instance = new IdentityCardNo();
					instance.setNo("123456789");
				}
			}
		}
		return instance;
	}
}
