package food;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:53
 */
public class PancakeTest {
    public static void main(String[] args) {

        Pancake pancake = new Pancake();
        System.out.println(pancake.desc());
        System.out.println(pancake.price());

        EggPancake eggPancake = new EggPancake(pancake);
        System.out.println(eggPancake.desc());
        System.out.println(eggPancake.price());

        HamPancake hamPancake = new HamPancake(eggPancake);
        System.out.println(hamPancake.desc());
        System.out.println(hamPancake.price());

        EggPancake egg2 = new EggPancake(hamPancake);
        System.out.println(egg2.desc());
        System.out.println(egg2.price());


    }
}
