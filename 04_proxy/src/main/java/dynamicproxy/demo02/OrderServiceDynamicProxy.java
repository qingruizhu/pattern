package dynamicproxy.demo02;

import staticproxy.demo02.DynamicDataSourceTL;
import staticproxy.demo02.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Class<?> clzz = target.getClass();
        ClassLoader classLoader = clzz.getClassLoader();
        Class<?>[] clzzs = clzz.getInterfaces();
        Object obj = Proxy.newProxyInstance(classLoader, clzzs, this);
        return obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object rst = method.invoke(target, args);
        after();
        return rst;
    }

    private void before(final Object target){
        try {
            Method method = target.getClass().getMethod("getCreateTime");
            Object createTime = method.invoke(target);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            String sd = sdf.format(new Date((Long)createTime));
            Integer year = Integer.valueOf(sd);
            DynamicDataSourceTL.set(year);
            System.out.println("[OrderServiceDynamicProxy]创建订单使用的数据源是："+DynamicDataSourceTL.get());
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }
    private void after(){
        System.out.println("[OrderServiceDynamicProxy]使用{"+DynamicDataSourceTL.get()+"}创建订单完成.......");
    }
}
