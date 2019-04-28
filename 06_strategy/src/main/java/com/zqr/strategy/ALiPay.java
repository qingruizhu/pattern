package com.zqr.strategy;

public class ALiPay extends IPay {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public Double queryBalance(String uid) {
        return 3000.0;
    }
}
