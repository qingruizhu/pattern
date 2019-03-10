package com.zqr.pattern.factory.sample;

import com.zqr.pattern.factory.product.course.ICourse;
import com.zqr.pattern.factory.product.course.JavaCourse;

/**
 * 简单工厂
 */
public class SampleFactory {

    public static ICourse create(String name){
        if (name.equals("java")){
            return new JavaCourse();
        }
        if (name.equals("python")){
            return new JavaCourse();
        }
        return null;
    }

    public static ICourse createByClassName(String className) {
        try {
            Class<?> aClass = Class.forName(className);
            return (ICourse) aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ICourse createByClass(Class clzz) {
        try {
            return (ICourse) clzz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
