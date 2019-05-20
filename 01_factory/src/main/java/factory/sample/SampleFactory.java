package factory.sample;

import factory.product.course.ICourse;
import factory.product.course.JavaCourse;

/**
 * 简单工厂
 * 概念：是指由一个可以创建出相同抽象，不同实现的同一系列产品的工厂。
 */
public class SampleFactory {

    /**
     *  特点：适用所需要创建的产品较少的场景，且需要用户知道产品的名称，传入工厂进行创建，
     *       但是用户对于具体的创建细节无需了解，只要索取就行了。
     */
    public static ICourse create(String name){
        /**
         * 缺点：当增加产品是，就要在这个创建方法里新增逻辑判断，
         *      虽然可以用反射等方法动态创建，但是这个简单工厂类的职责还是过重，不灵活，
         *      而且生产的产品种类单一，不利于产品扩展。
         */
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
