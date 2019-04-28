package com.zqr.strategy;

/**
 * 订单持有不同的策略
 */
public class Order {
    private String uid;
    private String oid;
    private Double amout;
    private IPay pay;

    public PayState pay(String payKey){
        IPay payMent = PayManager.getPayMent(payKey);
        System.out.println("欢迎使用："+payMent.getName()+"\r\n准备扣款："+amout);
        PayState state = payMent.pay(this.uid, this.amout);
        return state;
    }




    public Order(String uid, String oid, Double amout) {
        this.uid = uid;
        this.oid = oid;
        this.amout = amout;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Double getAmout() {
        return amout;
    }

    public void setAmout(Double amout) {
        this.amout = amout;
    }
}
