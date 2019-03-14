package com.zqr.delegate.boss;

public class EmployeeData implements IEmployee {
    public String doing(String command) {
        return "[EmployeeData]我接到命令"+command+",去删数据库.......";
    }
}
