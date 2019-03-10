package com.zqr.pattern.factory.abs;

import com.zqr.pattern.factory.product.course.ICourse;
import com.zqr.pattern.factory.product.course.PythonCourse;
import com.zqr.pattern.factory.product.note.INote;
import com.zqr.pattern.factory.product.note.PythonNote;

public class PythonAbstractFactory implements AbstractFactory {
    public ICourse createCourse() {
        return new PythonCourse();
    }
    public INote createNote() {
        return new PythonNote();
    }
}
