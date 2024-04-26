package exemplo.service;
import exemplo.model.Order;

import java.util.List;
public interface OrderService {
    Order findById(Long id);
    List<Order> findAll(Long id);
    void update(Long id, Order newOrder);
    List<Order> findAll();
    Order save(Order order);
    void delete(Long id);

}
