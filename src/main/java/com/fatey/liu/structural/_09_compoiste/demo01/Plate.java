package com.fatey.liu.structural._09_compoiste.demo01;

import java.util.ArrayList;
/**
 * @author Liu Fatey
 */
public class Plate extends MyElement {
	private ArrayList<MyElement> list = new ArrayList<>();

	public void add(MyElement element) {
		list.add(element);
	}

	public void remove(MyElement element) {
		list.remove(element);
	}

	@Override
	public void eat() {
		for(MyElement o : list) {
			o.eat();
		}
	}
}
