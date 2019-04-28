package com.zqr.strategy;

public class TestPay {

    public static void main(String[] args) {
        Order order = new Order("123", "123456", 800.0);
        PayState state = order.pay(PayManager.Payment.PAY_ALI);
        System.out.println(state);
    }
}
