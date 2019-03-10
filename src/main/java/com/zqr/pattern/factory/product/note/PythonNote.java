package com.zqr.pattern.factory.product.note;

public class PythonNote implements INote {

    public String note() {
        System.out.println("PythonNote.......");
        return "PythonNote";
    }
}
