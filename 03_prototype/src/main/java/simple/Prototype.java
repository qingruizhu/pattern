package simple;

public interface Prototype {
    /**
     * 浅克隆，只复制值类型数据，不复制引用对象
     * @return
     */
    Prototype shallowClone();

    /**
     * 深克隆，引用对象同样复制
     * @return
     */
    Prototype deepClone();
}
