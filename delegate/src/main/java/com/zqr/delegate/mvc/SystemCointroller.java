package com.zqr.delegate.mvc;

public class SystemCointroller {

    public String loginIn(){
        System.out.println("登录.......");
        return "登录.......";
    }

    public String loginOut(){
        System.out.println("退出.......");
        return "退出.......";
    }
}
