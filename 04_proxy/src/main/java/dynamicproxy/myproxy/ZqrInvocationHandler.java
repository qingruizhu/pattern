package dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * 自定义InvocationHandler
 */
public interface ZqrInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable;
}
