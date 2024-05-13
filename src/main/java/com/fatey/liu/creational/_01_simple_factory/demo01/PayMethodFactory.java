package com.fatey.liu.creational._01_simple_factory.demo01;

/**
 * @ClassName: PayMethodFactory
 * @Description: 简单工厂模式，定义一个获取支付方法的函数，将抽象支付方法赋予实际的支付类
 * @Author Liu_King
 * @Date 2024/5/13 23:42
 * @Version: v1.0
 */
public class PayMethodFactory {

    public static AbstractPay getPayMethod(String type) {
        if (type.equalsIgnoreCase("cash")) {
            return new CashPay();
        } else if (type.equalsIgnoreCase("creditcard")) {
            return new CreditcardPay();
        } else if (type.equalsIgnoreCase("weixin")) {
            return new WeixinPay();
        } else if (type.equalsIgnoreCase("alipay")) {
            return new AliPayPay();
        } else {
            return null;
        }
    }

}
