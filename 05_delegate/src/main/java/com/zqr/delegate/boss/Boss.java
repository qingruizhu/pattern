package com.zqr.delegate.boss;

public class Boss{
    public String command(String command,Leader leader){
        return leader.doing(command);
    }
}
