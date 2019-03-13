package dynamicproxy.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

public class ZqrClassLoader extends ClassLoader{
    private File classPathFile;
    public ZqrClassLoader() {
        String path = ZqrClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (null != classPathFile){
            File classFile = new File(classPathFile, name + ".class");
            if (classFile.exists()){
                try {
                    FileInputStream fis = new FileInputStream(classFile);
                    ByteArrayOutputStream os = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len=fis.read(buff))!=-1){
                        os.write(buff,0,len);
                    }
                    String className = ZqrClassLoader.class.getPackage().getName() + "." + name;
                    return defineClass(className,os.toByteArray(),0,os.size());
                }catch (Exception e){
                    e.fillInStackTrace();
                }
            }
        }
        return null;
    }

}
