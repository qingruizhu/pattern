package staticproxy.demo02;

public class DynamicDataSourceTL {
    private final static String DEFAULT_SOURCE = "DB_ZQR";
    private final static ThreadLocal<String> local = new ThreadLocal<String>();


    /**
     * 设置数据源
     * @param dataSource
     */
    public static void set(String dataSource){
        local.set(dataSource);
    }

    /**
     * 根据年份动态设置数据源
     * @param year
     */
    public static void set(int year){
        local.set("DB_"+year);
    }

    /**
     * 获取数据源
     * @return
     */
    public static String get() {
        return local.get();
    }

    /**
     * 重置默认数据源
     */
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    /**
     * 清空
     */
    public static void clear(){
        local.remove();
    }
}
