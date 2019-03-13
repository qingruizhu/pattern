package dynamicproxy.myproxy;

import java.lang.reflect.Method;

public class MeipoZqrProxy implements ZqrInvocationHandler {
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Object proxy = ZqrProxy.newProxyInstance(new ZqrClassLoader(), target.getClass().getInterfaces(), this);
        return proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object rst = method.invoke(this.target, args);
        after();
        return rst;

    }

    private void before() {
        System.out.println("[MeipoZqrProxy]我是zqr生成的媒婆：有什么要求和我说吧.......");

    }
    private void after() {
        System.out.println("[MeipoZqrProxy]对象找到了,感谢我吧.......");
    }
}
