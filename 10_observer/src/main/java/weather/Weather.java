package weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:    天气-被观察者，持有：所有的观察者；通知内容
 * @Auther: qingruizhu
 * @Date: 2019-04-29 16:45
 */
public class Weather {

    List<IUser> observers = null;
    private WeatherModel model;

    public Weather() {
    }

    public Weather(WeatherModel model) {
        this.model = model;
    }

    public void setModel(WeatherModel model) {
        this.model = model;
    }

    /**
     * @Description:
     *          添加观察者
     * @Author qingruizhu
     * @Date 17:07 2019-04-29
     * @Param [observer]
     * @return void
     **/
    public void addObserver(IUser observer){
        if (null == observers ) {
            observers = new ArrayList<IUser>();
        }
        observers.add(observer);
    }

    /**
     * @Description:
     *          通知所有的观察者
     * @Author qingruizhu
     * @Date 17:06 2019-04-29
     * @Param []
     * @return void
     **/
    public void adviseAll(){
        for (IUser observer : observers) {
            observer.advise(model);
        }

    }

}
