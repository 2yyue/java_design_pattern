package com.fatey.liu.creational._01_simple_factory.demo01;

/**
 * @ClassName: Client
 * @Description: 主函数，使用工厂类的获取支付方法函数获取对应支付方法类
 * @Author Liu_King
 * @Date 2024/5/13 23:45
 * @Version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractPay weixinPay = PayMethodFactory.getPayMethod("weixin");
        weixinPay.pay();
    }

}
