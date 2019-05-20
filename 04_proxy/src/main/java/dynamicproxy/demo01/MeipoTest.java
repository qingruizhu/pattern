package dynamicproxy.demo01;

import staticproxy.demo01.Daughter;
import staticproxy.demo01.Person;
import staticproxy.demo01.Son;
import staticproxy.demo02.IOrderService;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class MeipoTest {

    public static void main(String[] args) {

        //2.调用MeipoJDKProxy的getInstance(),为Son(实现了Person接口)生成代理类$Proxy0
        MeipoJDKProxy meipo = new MeipoJDKProxy();
        Person sonProxy = (Person)meipo.getInstance(new Son());
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream fos = new FileOutputStream("/Users/qingruizhu/IdeaProjects/pattern/04_proxy/src/main/java/dynamicproxy/demo01/$Proxy0.class");
            fos.write(bytes);
            fos.flush();
            fos.close();
        }catch (Exception e){
            e.fillInStackTrace();
        }




        //给闺女找对象
//        Person daughProxy = (Person)meipo.getInstance(new Daughter());
//        daughProxy.findLove();


        /**
         *
         *  CGLib 和 JDK 动态代理对比:
         *          1.JDK 动态代理是实现了被代理对象的接口，CGLib 是继承了被代理对象。
         *          2.JDK 和 CGLib 都是在运行期生成字节码，JDK 是直接写 Class 字节码，
         *            CGLib 使用 ASM 框架写 Class 字节码，Cglib 代理实现更复杂，生成代理类比 JDK 效率低。
         *          3.JDK 调用代理方法，是通过反射机制调用，CGLib 是通过 FastClass 机制直接调用方法， CGLib 执行效率更高。
         *
         *
         *
         *
         */

    }

}
