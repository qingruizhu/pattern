package com.zqr.strategy;

public class JDPay extends IPay {
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    public Double queryBalance(String uid) {
        return 2000.0;
    }
}
