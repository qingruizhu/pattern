package com.zqr.strategy;

public abstract class IPay {
    //获取支付类型
    public abstract String getName();
    //查询余额
    public abstract Double queryBalance(String uid);
    //
    public PayState pay(String uid,Double money){
        if (queryBalance(uid)<money){
            return new PayState("500","支付失败！","余额不足！");
        }
        return new PayState("200","支付成功！","支付了："+money);
    }


}
