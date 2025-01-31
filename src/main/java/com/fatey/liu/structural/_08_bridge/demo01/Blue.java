package com.fatey.liu.structural._08_bridge.demo01;

/**
 * @author Liu Fatey
 */
public class Blue implements Color {
	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "蓝色的" + name);
	}
}
