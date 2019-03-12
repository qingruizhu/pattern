package lazy;

import java.io.Serializable;

/**
 * 懒汉单例：
 *      需要的时候才创建实例
 */
public class LazySingleton{
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){};
    //非线程安全
    public static LazySingleton getInstance(){
        if (null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    //线程安全：方法加锁
    public synchronized static LazySingleton getInstance1(){
        if (null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //线程安全：代码块加锁,双重校验
    public static LazySingleton getInstance2(){
        if (null == lazySingleton){
            synchronized (LazySingleton.class){
                if (null == lazySingleton){
                    lazySingleton = new LazySingleton();
                    //分配内存
                    //初始化对象
                    //设置lazySingleton指向内存地址
                }
            }
        }
        return lazySingleton;
    }
}
