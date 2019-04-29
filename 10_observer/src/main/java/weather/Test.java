package weather;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-29 17:00
 */
public class Test {
    public static void main(String[] args) {
        Weather weather = new Weather(new WeatherModel(400,"打雷啦，劈人啦"));
        weather.addObserver(new NorthUser());
        weather.addObserver(new SourthUser());
        weather.adviseAll();
        //更换天气
        weather.setModel(new WeatherModel(200,"哎吆，天气不错哦"));
        weather.adviseAll();
    }
}
