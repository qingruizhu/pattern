package guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Description:事件
 * @Auther: qingruizhu
 * @Date: 2019-04-29 17:51
 */
public class GuaEvent {

    @Subscribe
    public void ss(String msg){
        System.out.println("add["+msg+"]⌚️...1");
    }

}
