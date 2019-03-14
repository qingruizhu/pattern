package com.zqr.delegate.boss;

public class EmployeeBong implements IEmployee {
    public String doing(String command) {
        return "[EmployeeBong]我接到命令"+command+",去炸服务器.......";
    }
}
