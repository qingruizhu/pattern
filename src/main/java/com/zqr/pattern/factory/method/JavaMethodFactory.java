package com.zqr.pattern.factory.method;

import com.zqr.pattern.factory.product.course.ICourse;
import com.zqr.pattern.factory.product.course.JavaCourse;

public class JavaMethodFactory implements MethodFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
