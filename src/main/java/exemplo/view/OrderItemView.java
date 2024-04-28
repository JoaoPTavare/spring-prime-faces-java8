package exemplo.view;

import exemplo.model.Customer;
import exemplo.model.OrderItem;
import exemplo.service.OrderItemService;
import exemplo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

public class OrderItemView {

    private final OrderItemService orderItemService;
    private OrderItem orderItem;


    @Autowired
    public OrderItemView(OrderService orderService, OrderItemService orderItemService, OrderItem orderItem) {
        this.orderItemService = orderItemService;
        this.orderItem = orderItem;

    }

    @PostConstruct
    public void init() {
        orderItem = new OrderItem();
    }
    public OrderItem save() {
        return orderItemService.save(orderItem);
    }


    public void delete(Long id) {
        orderItemService.delete(id);
    }

    public List<OrderItem> findAll() {
        return orderItemService.findAll();
    }

    public void update(Long id, OrderItem newOrderItem) {
        orderItemService.update(id, newOrderItem);
    }

    public OrderItem findById(Long id) {
        return orderItemService.findById(id);
    }


    public OrderItem getCustomer() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
