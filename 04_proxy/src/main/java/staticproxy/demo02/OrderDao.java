package staticproxy.demo02;

public class OrderDao {
    public int insertDao(Order order){
        System.out.println("[OrderDao]插入订单成功");
        return 1;
    }
}
