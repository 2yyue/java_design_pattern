package com.fatey.liu.demo01;

/**
 * @ClassName: Animal
 * @Description: 抽象类动物，有吃和life()、叫声()和show()等抽象方法
 * @Author Liu_King
 * @Date 2023/12/13 21:39
 * @Version: v1.0
 */
public abstract class Animal {

    String name;
    Long age;
    abstract void eat();

    abstract void life();

    abstract void sounded();

    abstract void show();

}
