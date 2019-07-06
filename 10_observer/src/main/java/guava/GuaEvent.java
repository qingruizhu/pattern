package guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Description:事件
 * @Date: 2019-04-29 17:51
 */
public class GuaEvent {

    @Subscribe
    public void notice(String msg){
        System.out.println("通知["+msg+"]⌚️...1");
    }

}
