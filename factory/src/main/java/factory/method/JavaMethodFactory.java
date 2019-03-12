package factory.method;

import factory.product.course.ICourse;
import factory.product.course.JavaCourse;

public class JavaMethodFactory implements MethodFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
