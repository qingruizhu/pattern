package food;

/**
 * @Description:
 *          加个火腿
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:49
 */
public class HamPancake extends Pancake {
    private Pancake pancake;

    public HamPancake(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String desc() {
        return pancake.desc()+"+1个火腿肠";
    }

    @Override
    public double price() {
        return pancake.price()+5;
    }
}
