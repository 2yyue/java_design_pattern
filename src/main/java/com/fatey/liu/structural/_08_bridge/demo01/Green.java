package com.fatey.liu.structural._08_bridge.demo01;

/**
 * @author Liu Fatey
 */
public class Green implements Color {
	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "绿色的" + name);
	}
}