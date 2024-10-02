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
        if ("cash".equalsIgnoreCase(type)) {
            return new CashPay();
        } else if ("creditcard".equalsIgnoreCase(type)) {
            return new CreditcardPay();
        } else if ("weixin".equalsIgnoreCase(type)) {
            return new WeixinPay();
        } else if ("alipay".equalsIgnoreCase(type)) {
        // } else if (type.equalsIgnoreCase("alipay")) {
            return new AliPayPay();
        } else {
            return null;
        }
    }

}
