package com.zqr.strategy;

/**
 * 策略模式：
 *      定义了算法家族、分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户。
 *      侧重点：不是如何来实现算法，而是如何组织和调用这些算法，从而让我们的程序结构更加的灵活、可扩展。
 *
 *  支付策略:   IPay <---- ALiPay
 *                  <---- JDPay
 *                  <---- WechatPay
 *
 *  策略上下文:  Order,持有策略，可对不同的策略进行调度
 */
public class Order {
    private String uid;
    private String oid;
    private Double amout;
    /**
     * Order：持有支付策略
     */
    private IPay pay;

    /**
     * Order：对不同的策略进行调度
     */
    public PayState pay(String payKey){
        /**
         * 不同的策略从策略工厂中取
         */
        IPay pay = PayManager.getPayMent(payKey);
        System.out.println("欢迎使用："+pay.getName()+"\r\n准备扣款："+amout);
        PayState state = pay.pay(this.uid, this.amout);
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
