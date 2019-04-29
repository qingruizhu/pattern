package power;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 14:04
 */
public class PowerTest {
    public static void main(String[] args) {
        DC5 dc = new PowerAdapter(new AC220());
        int dc5V = dc.outputDC5V();
    }
}
