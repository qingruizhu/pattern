package com.zqr.delegate.mvc;

public class UserController {


    public String getUserById(String uid){
        System.out.println("[UserController]获取有用户："+uid);
        return "[UserController]获取有用户："+uid;
    }
}
