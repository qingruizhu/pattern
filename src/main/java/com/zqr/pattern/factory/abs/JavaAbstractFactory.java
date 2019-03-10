package com.zqr.pattern.factory.abs;


import com.zqr.pattern.factory.product.course.ICourse;
import com.zqr.pattern.factory.product.course.JavaCourse;
import com.zqr.pattern.factory.product.note.INote;
import com.zqr.pattern.factory.product.note.JavaNote;

public class JavaAbstractFactory implements AbstractFactory{
    public ICourse createCourse() {
        return new JavaCourse();
    }
    public INote createNote() {
        return new JavaNote();
    }
}
