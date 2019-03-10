package com.zqr.pattern.factory.abs;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory javaFactory = new JavaAbstractFactory();
        javaFactory.createCourse().record();
        javaFactory.createNote().note();

        AbstractFactory pythonFactory = new PythonAbstractFactory();
        pythonFactory.createCourse().record();
        pythonFactory.createNote().note();

    }
}
