package lazy;

public class LazyExecutor implements Runnable{
    public void run() {
       // LazySingleton instance = LazySingleton.getInstance2();
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getIntance();
        long time = System.currentTimeMillis();
        System.out.println("[time"+time+"]"+Thread.currentThread().getName()+":"+instance);
    }
}
