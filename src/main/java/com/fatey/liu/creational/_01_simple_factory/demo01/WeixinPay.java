package com.fatey.liu.creational._01_simple_factory.demo01;

/**
 * @ClassName: WeixinPay
 * @Description: 微信支付类，继承于抽象支付类
 * @Author Liu_King
 * @Date 2024/5/13 23:41
 * @Version: v1.0
 */
public class WeixinPay extends AbstractPay {

    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }

}
