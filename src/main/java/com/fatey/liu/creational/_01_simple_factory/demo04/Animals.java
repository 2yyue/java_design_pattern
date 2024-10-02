package com.fatey.liu.creational._01_simple_factory.demo04;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/9/29 上午1:28
 */
public enum Animals implements Animal {
	CAT {
		@Override
		public void eat() {
			System.out.print("吃鱼");
		}
		
		@Override
		public void sound() {
			System.out.print("喵喵喵。。。。");
		}
		
		@Override
		public void getInfo(String name) {
			System.out.print("小猫" + name);
		}
	},
	DOG {
		@Override
		public void eat() {
			System.out.print("吃肉");
		}
		
		@Override
		public void sound() {
			System.out.print("汪汪汪。。。。");
		}
		
		@Override
		public void getInfo(String name) {
			System.out.print("小狗" + name);
		}
	},
	MOUSE {
		@Override
		public void eat() {
			System.out.print("吃灯油");
		}
		
		@Override
		public void sound() {
			System.out.print("吱吱叫。。。。");
		}
		
		@Override
		public void getInfo(String name) {
			System.out.print("小老鼠" + name);
		}
	}
	
}
