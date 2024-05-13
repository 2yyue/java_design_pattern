package com.fatey.liu.creational._01_simple_factory.demo01;

/**
 * @ClassName: CreditcardPay
 * @Description: 信用卡支付类，继承于抽象支付类
 * @Author Liu_King
 * @Date 2024/5/13 23:40
 * @Version: v1.0
 */
public class CreditcardPay extends AbstractPay {

    @Override
    public void pay() {
        System.out.println("使用信用卡支付");
    }

}
