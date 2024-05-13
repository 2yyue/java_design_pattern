package com.fatey.liu.demo01;

/**
 * @ClassName: cat
 * @Description:
 * @Author Liu_King
 * @Date 2023/12/13 21:43
 * @Version: v1.0
 */
public class Cat extends Animal {

    void eat() {
        System.out.println("Cat eats");
    }
    void life() {
        System.out.println("Cat lives");
    }
    void sounded() {
        System.out.println("Cat can sound miao!");
    }
    void show() {
        System.out.println("this Cat is " + name + ", it is " + age + " years old!");
    }

}
