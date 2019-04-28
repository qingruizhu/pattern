package com.zqr.delegate.boss;

public class BossDelegateTest {

    public static void main(String[] args) {
        String command = new Boss().command(Leader.DATA_DELETE, new Leader());
        System.out.println(command);
    }
}
