package register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton(){};

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    /**
     * 存在线程问题，所以要使用synchronized加锁
     * @param className
     * @return
     */
    public static Object getBean(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                try {
                    Class<?> clazz = Class.forName(className);
                    Object obj = clazz.newInstance();
                    ioc.put(className, obj);
                    return obj;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ioc.get(className);
        }
    }



}
