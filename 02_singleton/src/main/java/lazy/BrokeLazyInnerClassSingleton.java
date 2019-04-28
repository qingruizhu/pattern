package lazy;

import hungry.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class BrokeLazyInnerClassSingleton {


    public static void main(String[] args) {
        //brokeByReflect();
        brokeBySerializable();
    }

    /**
     * 通过反射强行访问私有构造方法，破坏单例模式
     */
    private static void brokeByReflect(){
        Class<?> clzz = LazyInnerClassSingleton.class;
        Constructor<?> cs = null;
        Object obj1 = null;
        try {
            cs = clzz.getDeclaredConstructor(null);
            cs.setAccessible(true);
            obj1 = cs.newInstance();
            System.out.println(obj1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LazyInnerClassSingleton obj2 = LazyInnerClassSingleton.getIntance();
        System.out.println(obj2);
    }

    private static void brokeBySerializable(){
        HungrySingleton obj1 = HungrySingleton.getInstance();
        System.out.println(obj1);
        HungrySingleton obj2 = null;
        try {
            FileOutputStream os = new FileOutputStream("HungrySingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(obj1);
            oos.flush();
            oos.close();
            os.close();

            FileInputStream fis = new FileInputStream("HungrySingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //重写readResolve()
            obj2 = (HungrySingleton)ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj2);
        System.out.println(obj1==obj2);
    }
}
