package hungry;

/**
 * 饿汉模式Test
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
}
