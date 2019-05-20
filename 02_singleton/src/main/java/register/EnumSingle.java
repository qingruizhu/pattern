package register;

/**
 * 枚举式单例：天生的安全单例模式
 *      不能被反射和反序列化破坏单例模式
 *     因为：
 *      1.检查它的字节码会发现，枚举的实例对象是被 static final 修饰的。
 *      2.jdk源码中对枚举的反射访问做了特殊的判断，会抛出异常。
 */
public enum EnumSingle {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingle getInstance(){
        return INSTANCE;
    }
}
