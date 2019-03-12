package staticproxy.demo02;

import java.util.Date;

public class OrderServiceProxyTest {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date("2013/09/08").getTime());

        OrderServiceImpl orderService = new OrderServiceImpl(new OrderDao());
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(orderService);
        proxy.createOrder(order);

    }
}
