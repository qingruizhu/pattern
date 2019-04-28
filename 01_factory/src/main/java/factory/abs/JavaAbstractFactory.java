package factory.abs;


import factory.product.course.ICourse;
import factory.product.course.JavaCourse;
import factory.product.note.INote;
import factory.product.note.JavaNote;

public class JavaAbstractFactory implements AbstractFactory{
    public ICourse createCourse() {
        return new JavaCourse();
    }
    public INote createNote() {
        return new JavaNote();
    }
}
