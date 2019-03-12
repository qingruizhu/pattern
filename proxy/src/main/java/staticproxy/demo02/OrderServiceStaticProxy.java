package staticproxy.demo02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {
        before(order);
        int count = orderService.createOrder(order);
        after();
        return count;
    }
    private void before(final Order order){
        String sd = sdf.format(new Date(order.getCreateTime()));
        Integer year = Integer.valueOf(sd);
        DynamicDataSourceTL.set(year);
        System.out.println("[orderServiceStaticProxy]创建订单使用的数据源是："+DynamicDataSourceTL.get());
    }
    private void after(){
        System.out.println("[orderServiceStaticProxy]使用{"+DynamicDataSourceTL.get()+"}创建订单完成.......");
    }
}
