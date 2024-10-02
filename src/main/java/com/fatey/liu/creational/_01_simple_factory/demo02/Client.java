package com.fatey.liu.creational._01_simple_factory.demo02;

import com.fatey.liu.XMLUtil;

/**
 * @ClassName: Client
 * @Description: 主函数，通过电视工厂生产不同品牌的电视
 * @Author Liu_King
 * @Date 2024/5/14 0:56
 * @Version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        TV huaweiTV = TVFactory.getBrand("huawei");
        huaweiTV.play();
        TV sonyTV = TVFactory.getBrand(XMLUtil.getStringParm());
        sonyTV.play();
    }

}
