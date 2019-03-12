package staticproxy.demo01;

/**
 * 被代理者：儿子
 */
public class Son implements Person{
    public void findLove() {
        System.out.println("[son]儿子要求：肤白貌美大长腿.......");
    }
}
