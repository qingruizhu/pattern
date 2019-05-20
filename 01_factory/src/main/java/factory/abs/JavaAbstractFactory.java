package factory.abs;


import factory.product.course.ICourse;
import factory.product.course.JavaCourse;
import factory.product.note.INote;
import factory.product.note.JavaNote;

/**
 * 抽象工厂：可以创建一个品牌下的系列产品。
 */
public class JavaAbstractFactory implements AbstractFactory{
    /**
     * 特点：
     *  相对于工厂方法，新增了创建不同产品的功能createNote（）可以生产笔记了，不再是单一的生产课程；
     *  而且，JavaAbstractFactory这个工厂生产的不管是笔记还是课程，都属于Java品牌的.
     */
    public ICourse createCourse() {
        return new JavaCourse();
    }
    public INote createNote() {
        return new JavaNote();
    }
    /**
     *   缺点：
     *      当新增一款产品时，需要在AbstractFactory抽象工厂中新增接口方法，
     *      而且每个品牌都需要维护此产品的实现。工作量提升了，给产品的拓展带来不便。
     *      所以，产品的最初构想至关重要，同样的，在后期的代码维护中也要灵活变通，没有一成不变的设计模式。
     */
}
