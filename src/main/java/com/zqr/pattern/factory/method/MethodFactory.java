package com.zqr.pattern.factory.method;

import com.zqr.pattern.factory.product.course.ICourse;

public interface MethodFactory {
    ICourse create();
}
