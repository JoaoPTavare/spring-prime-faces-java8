package exemplo.service;


import exemplo.model.OrderItem;

import java.util.List;

public interface OrderItemService {
    OrderItem save(OrderItem orderItem);

    void delete(Long id);

    List<OrderItem> findAll();

    void update(Long id, OrderItem orderItem);

    OrderItem findById(Long id);
}
