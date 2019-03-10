package com.zqr.pattern.factory.product.note;

public class JavaNote implements INote {

    public String note() {
        System.out.println("JavaNote.......");
        return "JavaNote";
    }
}
