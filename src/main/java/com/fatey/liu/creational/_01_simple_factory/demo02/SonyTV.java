package com.fatey.liu.creational._01_simple_factory.demo02;

/**
 * @ClassName: SonyTV
 * @Description: 实体类 索尼电视类
 * @Author Liu_King
 * @Date 2024/5/14 0:51
 * @Version: v1.0
 */
public class SonyTV implements TV {

    @Override
    public void play() {
        System.out.println("看索尼电视");
    }

}
