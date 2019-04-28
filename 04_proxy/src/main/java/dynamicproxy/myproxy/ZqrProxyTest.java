package dynamicproxy.myproxy;

import staticproxy.demo01.Person;
import staticproxy.demo01.Son;

public class ZqrProxyTest {
    public static void main(String[] args) {

        MeipoZqrProxy zqrProxy = new MeipoZqrProxy();
        Person person = (Person)zqrProxy.getInstance(new Son());
        try {
            person.findLove();

        }catch (Exception e){
            e.fillInStackTrace();
        }

    }
}
