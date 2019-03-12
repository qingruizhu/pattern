package threadlocal;

/**
 * 天生线程内安全
 *      保证单线程内单例模式的实现
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue(){
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){};

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
