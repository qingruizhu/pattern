package food;

/**
 * @Description:基础煎饼
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:48
 */
public class Pancake implements Food {

    public String desc() {
        return "煎饼";
    }

    public double price() {
        return 10;
    }
}
