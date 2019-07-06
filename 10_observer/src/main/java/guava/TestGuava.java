package guava;

import com.google.common.eventbus.EventBus;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-29 17:54
 */
public class TestGuava {
    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        GuaEvent guaEvent = new GuaEvent();

        eventBus.register(guaEvent);

        eventBus.post("哈哈哈哈哈");

    }
}
