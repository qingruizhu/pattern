package factory.method;

/**
 * 工厂方法：
 *      定义一个创建对象的接口方法，让实现类工厂去实现，也就是把产品的创建延时到子类工厂中去了。
 *
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        /**
         * 特点：
         *  1.相对于简单工厂，解偶了工厂的职责，新增了工厂的种类，不再是一个万能的工厂生产所有的产品；
         *  2.什么工厂生产什么产品，工厂和产品是一一对应的，比如java工厂就只生产java课程
         *  3.用户同样不用关注产品的创建细节，只需要拿到工厂即可.
         */
        MethodFactory javaFactory = new JavaMethodFactory();
        javaFactory.create().record();
        MethodFactory pythonFactory = new PythonMethodFactory();
        pythonFactory.create().record();
        /**
         * 缺点：
         *    1.新增产品时，就要新增对应的共产，增加了代码的复杂度。
         *    2.工厂的种类过多，增加了系统的抽象性和理解难度，也给用户带来不便。
         */
    }
}
