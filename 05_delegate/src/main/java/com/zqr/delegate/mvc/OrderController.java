package com.zqr.delegate.mvc;

public class OrderController {

    public String getOrderById(String oid){
        System.out.println("[OrderController]获取订单："+oid);

        return "[OrderController]获取订单："+oid;
    }
}
