package com.fatey.liu.creational._01_simple_factory.demo02;

/**
 * @ClassName: TVFactory
 * @Description: 电视工厂类，获取电视品牌实例化对应的电视实体类
 * @Author Liu_King
 * @Date 2024/5/14 0:52
 * @Version: v1.0
 */
public class TVFactory {

    public static TV getTVBrand(String brand) {
        if (brand.equalsIgnoreCase("huawei")) {
            return new HuaweiTV();
        } else if (brand.equalsIgnoreCase("sony")) {
            return new SonyTV();
        } else {
            return null;
        }
    }

}
