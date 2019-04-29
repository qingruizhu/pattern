package weather;

/**
 * @Description:北方的观察者
 * @Auther: qingruizhu
 * @Date: 2019-04-29 16:49
 */
public class NorthUser implements IUser {
    public void advise(WeatherModel model) {
        System.out.println(model.getCode()+"的天气:"+model.getMessage()+"。【北方的老少爷们们】"+model.getNotice());
    }
}
