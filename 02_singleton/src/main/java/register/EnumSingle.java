package register;

/**
 * 枚举式单例
 *      不能被反射和反序列化破坏单例模式
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
