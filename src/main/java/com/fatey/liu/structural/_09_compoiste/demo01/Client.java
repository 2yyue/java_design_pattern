package com.fatey.liu.structural._09_compoiste.demo01;

/**
 * @author Liu Fatey
 */
public class Client {
	public static void main(String[] args) {
		MyElement o1, o2, o3, o4, o5;
		Plate p1, p2, p3;
		o1 = new Banana();
		o2 = new Pear();
		o3 = new Apple();
		o4 = new Pear();
		o5 = new Apple();
		p1 = new Plate();
		p2 = new Plate();
		p3 = new Plate();
		p1.add(o1);
		p1.add(o2);
		p2.add(o3);
		p2.add(o4);
		p3.add(o5);
		p1.eat();
		p2.eat();
		p3.eat();
	}
}
