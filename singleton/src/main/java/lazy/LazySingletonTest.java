package lazy;

public class LazySingletonTest {
    public static void main(String[] args) {
        LazyExecutor lazyExecutor = new LazyExecutor();
        for (int i = 0; i <10 ; i++) {
            new Thread(lazyExecutor).start();
        }
    }
}
