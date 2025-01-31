package com.fatey.liu.structural._08_bridge.demo01;

/**
 * @author Liu Fatey
 */
public class Red implements Color {
	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "红色的" + name);
	}
}
