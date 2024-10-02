package com.fatey.liu.demo01;

/**
 * @ClassName: Client
 * @Description:
 * @Author Liu_King
 * @Date 2023/12/13 21:45
 * @Version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal.life();
        animal.sounded();
        animal.age = 10L;
        animal.name = "Tom";
        animal.show();
    }
}
