package secao12;

import java.util.Date;
import secao12.entities.Order;
import secao12.entities_enums.OrderStatus;

public class Enum {
    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
