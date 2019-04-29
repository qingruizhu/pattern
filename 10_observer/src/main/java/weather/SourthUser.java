package weather;

/**
 * @Description:南方的观察者
 * @Auther: qingruizhu
 * @Date: 2019-04-29 16:49
 */
public class SourthUser implements IUser {
    public void advise(WeatherModel model) {
        System.out.println(model.getCode() + "的天气:" + model.getMessage() + "。【南方的大妹子们】️" + model.getNotice());
    }
}
