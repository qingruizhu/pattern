package factory.abs;

import factory.product.course.ICourse;
import factory.product.note.INote;

public interface AbstractFactory {
    ICourse createCourse();
    INote createNote();

}
