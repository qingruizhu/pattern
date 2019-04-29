package power;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 14:01
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5V() {
        int ac = ac220.outAC220V();
        int dc = ac / 4;
        System.out.println("输出直流电"+dc+"V");
        return dc;
    }
}
