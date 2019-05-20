package hungry;

import java.io.Serializable;

/**
 * 饿汉模式:类加载的时候直接创建实例，需要的时候直接返回实例对象
 */
public class HungrySingleton implements Serializable {
    //1.恶汉第一种方式：静态属性
    private static HungrySingleton hungrySingleton = new HungrySingleton();//类加载的时候执行，有且只执行一次
    //2.恶汉第二种：静态代码块
/*    static{
        hungrySingleton = new HungrySingleton();
        System.out.println("HungrySingleton静态代码块执行hungrySingleton="+hungrySingleton);
    }*/
    private HungrySingleton(){
        System.out.println("HungrySingleton私有无参构造执行.......");
    };

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 2.重写readResolv(),可阻止，反序列化时破坏单例模式
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }
}
