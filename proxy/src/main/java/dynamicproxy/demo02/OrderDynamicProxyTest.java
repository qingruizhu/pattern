package dynamicproxy.demo02;

import staticproxy.demo02.IOrderService;
import staticproxy.demo02.Order;
import staticproxy.demo02.OrderDao;
import staticproxy.demo02.OrderServiceImpl;

import java.util.Date;

public class OrderDynamicProxyTest {


    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date().getTime());

        OrderServiceDynamicProxy proxy = new OrderServiceDynamicProxy();
        IOrderService orderService = (IOrderService)proxy.getInstance(new OrderServiceImpl(new OrderDao()));
        orderService.createOrder(order);


    }
}
