package factory.abs;

import factory.product.course.ICourse;
import factory.product.course.PythonCourse;
import factory.product.note.INote;
import factory.product.note.PythonNote;

public class PythonAbstractFactory implements AbstractFactory {
    public ICourse createCourse() {
        return new PythonCourse();
    }
    public INote createNote() {
        return new PythonNote();
    }
}
