package staticproxy.demo02;

public class OrderServiceImpl implements IOrderService {
    private OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public int createOrder(Order order) {
        System.out.println("[orderServiceImpl]创建订单.......");
        int count = this.orderDao.insertDao(order);
        return count;
    }
}
