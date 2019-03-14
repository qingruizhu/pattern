package com.zqr.delegate.boss;

public class EmployeeBug implements IEmployee {
    public String doing(String command) {
        return "[employeeA]我负责改"+command+".......";
    }
}
