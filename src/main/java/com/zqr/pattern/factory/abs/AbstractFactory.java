package com.zqr.pattern.factory.abs;

import com.zqr.pattern.factory.product.course.ICourse;
import com.zqr.pattern.factory.product.note.INote;

public interface AbstractFactory {
    ICourse createCourse();
    INote createNote();

}
