package com.zqr.strategy;

public class WechatPay extends IPay {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public Double queryBalance(String uid) {
        return 1000.0;
    }
}
