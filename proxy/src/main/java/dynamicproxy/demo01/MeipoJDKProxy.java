package dynamicproxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeipoJDKProxy implements InvocationHandler {
    //持有被代理对象
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        Class<?>[] interfaces = clazz.getInterfaces();
        Object obj = Proxy.newProxyInstance(classLoader, interfaces, this);
        return obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object rst = method.invoke(this.target, args);
        after();
        return rst;
    }

    private void before() {
        System.out.println("[MeipoJDKProxy]我是媒婆：有什么要求和我说吧.......");

    }
    private void after() {
        System.out.println("[MeipoJDKProxy]对象找到了,感谢我吧.......");
    }
}
