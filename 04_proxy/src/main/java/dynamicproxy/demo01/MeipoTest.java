package dynamicproxy.demo01;

import staticproxy.demo01.Daughter;
import staticproxy.demo01.Person;
import staticproxy.demo01.Son;
import staticproxy.demo02.IOrderService;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class MeipoTest {

    public static void main(String[] args) {
        MeipoJDKProxy meipo = new MeipoJDKProxy();
        //给儿子找对象
        Person sonProxy = (Person)meipo.getInstance(new Son());
        sonProxy.findLove();
        System.out.println("...................................next...................................");
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("Test", new Class[]{IOrderService.class});
            FileOutputStream fos = new FileOutputStream("E://test/Test.class");
            fos.write(bytes);
            fos.flush();
            fos.close();
        }catch (Exception e){
            e.fillInStackTrace();
        }



        //给闺女找对象
//        Person daughProxy = (Person)meipo.getInstance(new Daughter());
//        daughProxy.findLove();



    }

}
