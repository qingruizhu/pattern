package power;

/**
 * @Description:
 *          被适配者，直流电220V
 * @Auther: qingruizhu
 * @Date: 2019-04-28 13:52
 */
public class AC220 {

    public int outAC220V() {
        int out = 220;
        System.out.println("输出交流电"+out+"V");
        return out;
    }
}
