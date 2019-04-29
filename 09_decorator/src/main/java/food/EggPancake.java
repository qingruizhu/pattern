package food;

/**
 * @Description:
 *          加个鸡蛋
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:49
 */
public class EggPancake extends Pancake {
    private Pancake pancake;

    public EggPancake(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String desc() {
        return pancake.desc()+"+1个鸡蛋";
    }

    @Override
    public double price() {
        return pancake.price()+3;
    }
}
