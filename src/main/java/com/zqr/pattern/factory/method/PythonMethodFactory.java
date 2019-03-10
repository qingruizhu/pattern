package com.zqr.pattern.factory.method;

import com.zqr.pattern.factory.product.course.ICourse;
import com.zqr.pattern.factory.product.course.PythonCourse;

public class PythonMethodFactory implements MethodFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
