package com.fatey.liu.creational._01_simple_factory.demo02;

/**
 * @ClassName: HuaweiTV
 * @Description: 实体类 华为智慧屏类
 * @Author Liu_King
 * @Date 2024/5/14 0:44
 * @Version: v1.0
 */
public class HuaweiTV implements TV {

    @Override
    public void play() {
        System.out.println("使用华为智慧屏看电视");
    }

}
