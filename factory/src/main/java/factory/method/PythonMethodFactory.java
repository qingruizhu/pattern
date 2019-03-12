package factory.method;

import factory.product.course.ICourse;
import factory.product.course.PythonCourse;

public class PythonMethodFactory implements MethodFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
