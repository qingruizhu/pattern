package guava;

import com.google.common.eventbus.EventBus;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-29 17:54
 */
public class TestGuava {
    public static void main(String[] args) {
        GuaEvent guaEvent = new GuaEvent();
        EventBus eventBus = new EventBus();
        eventBus.register(guaEvent);
        eventBus.post("zhuqingrui");
    }
}
