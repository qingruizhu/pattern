package weather;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-29 17:00
 */
public class Test {
    public static void main(String[] args) {
        Weather weather = new Weather();
        //设置天气
        weather.setModel(new WeatherModel(200,"哎吆，天气不错哦"));
        //添加地区
        weather.addObserver(new NorthUser());
        weather.addObserver(new SourthUser());
        //播报天气预报
        weather.adviseAll();
    }
}
