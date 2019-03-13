package dynamicproxy.myproxy;

import staticproxy.demo01.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class CreateZqrProxyTest {

    public static void main(String[] args) {
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream fos = new FileOutputStream("E://test/$Proxy.class");
            fos.write(bytes);
            fos.flush();
            fos.close();
        }catch (Exception e){
            e.fillInStackTrace();
        }

    }
}
