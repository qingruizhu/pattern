package dynamicproxy.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ZqrProxy {
    private static String ln = "\r\n";
    //类路径   /D:/ideal/work/pattern/proxy/target/classes/dynamicproxy/myproxy/
    private static String filePath = ZqrProxy.class.getResource("").getPath();
    public static Object newProxyInstance(ZqrClassLoader classLoader,Class<?>[] interfaces,ZqrInvocationHandler invocationHandler){
        //1.动态生成源码.java文件
        String src = generateSrc(interfaces);
        //2.java文件输出到磁盘
        File file = new File(filePath + "$Proxy0.java");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(src);
            writer.flush();
            writer.close();
//            FileOutputStream fos = new FileOutputStream(filePath + "$Proxy0.java");
//            fos.write(src.getBytes());
//            fos.flush();
//            fos.close();
        }catch (Exception e){
            e.fillInStackTrace();
        }
        //3.编译成.class字节码文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        file.delete();
        //4.jvm加载.class文件
        try {
            Class<?> proxyClass = classLoader.findClass("$Proxy0");
            Constructor<?> cs = proxyClass.getConstructor(ZqrInvocationHandler.class);
            //5.初始化对象
            Object proxyObj = cs.newInstance(invocationHandler);
            return proxyObj;
        }catch (Exception e){
            e.fillInStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();

        //1.导包
        sb.append("package dynamicproxy.myproxy;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("import staticproxy.demo01.Person;"+ln);
        //2.类
        sb.append("public final class $Proxy0 extends ZqrProxy implements Person {"+ln);
        //3.类中持有invocationhandler对象
        sb.append("ZqrInvocationHandler h;"+ln);
        //4.构造方法
        sb.append("public $Proxy0(ZqrInvocationHandler h){"+ln);
        sb.append("this.h=h;"+ln);
        sb.append("}"+ln);
        //5.循环拼接interface中所有的方法
        Method[] methods = interfaces[0].getMethods();
        for (Method method :methods) {
            sb.append("public final "+method.getReturnType()+" "+method.getName()+"(){"+ln);
            sb.append("try{"+ln);
            sb.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""+method.getName()+"\",new Class[]{});"+ln);
            sb.append("this.h.invoke(this,m,null);"+ln);
            sb.append("}catch(Throwable e){"+ln);
            sb.append("e.printStackTrace();"+ln);
            sb.append("}"+ln);
            sb.append("}"+ln);
        }
        sb.append("}"+ln);
        System.out.println(sb.toString());
        return sb.toString();
    }
}

