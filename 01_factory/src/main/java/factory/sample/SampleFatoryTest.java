package factory.sample;

import factory.product.course.ICourse;
import factory.product.course.JavaCourse;

public class SampleFatoryTest {

    public static void main(String[] args) {
        ICourse course = SampleFactory.create("java");
        course.record();

        ICourse byClassName = SampleFactory.createByClassName("");
        byClassName.record();

        ICourse byClass = SampleFactory.createByClass(JavaCourse.class);
        byClass.record();

    }
}
