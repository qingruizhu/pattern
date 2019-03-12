package lazy;

/**
 * 饿汉式内部类：
 *         既兼顾了饿汉式的内存浪费，也兼顾了synchronized的安全与性能问题。
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        //防止反射破坏单例模式
        if (null != LazyHolder.LAZY){
            throw new RuntimeException("LazyInnerClassSingleton不允许创建多个实例");
        }
    };

    public static LazyInnerClassSingleton getIntance(){
        return LazyHolder.LAZY;
    }

    /**
     * 内部类默认不加载，只有在使用的时候才加载
     */
    private static class LazyHolder{
        private static LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
