package com.zqr.strategy;

import org.omg.CORBA.OBJ_ADAPTER;

public class PayState {

    private String code;
    private String msg;
    private Object data;

    public PayState(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "支付码='" + code + '\'' +
                ", 结果='" + msg + '\'' +
                ", 内容=" + data +
                '}';
    }
}
