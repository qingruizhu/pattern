package register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class BrokeEnumSingletonTest {


    public static void main(String[] args) {
        //brokeByReflect();
        brokeBySerializable();
    }

    /**
     * 通过反射强行访问私有构造方法，破坏单例模式
     */
    private static void brokeByReflect(){
        Class<?> clzz = EnumSingle.class;
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
        EnumSingle obj2 = EnumSingle.getInstance();
        System.out.println(obj2);
    }

    private static void brokeBySerializable(){
        EnumSingle obj1 = EnumSingle.getInstance();
        obj1.setData(new Object());
        System.out.println(obj1.getData());
        EnumSingle obj2 = null;
        try {
            FileOutputStream os = new FileOutputStream("EnumSingle.obj");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(obj1);
            oos.flush();
            oos.close();
            os.close();

            FileInputStream fis = new FileInputStream("EnumSingle.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //重写readResolve()
            obj2 = (EnumSingle)ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj2.getData());
        System.out.println(obj1.getData()==obj2.getData());
    }
}
