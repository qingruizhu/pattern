package dynamicproxy.deom01;

import staticproxy.demo01.Daughter;
import staticproxy.demo01.Person;
import staticproxy.demo01.Son;

public class MeipoTest {

    public static void main(String[] args) {
        MeipoJDKProxy meipo = new MeipoJDKProxy();
        //给儿子找对象
        Person sonProxy = (Person)meipo.getInstance(new Son());
        sonProxy.findLove();
        System.out.println("...................................next...................................");
        //给闺女找对象
        Person daughProxy = (Person)meipo.getInstance(new Daughter());
        daughProxy.findLove();
    }

}
