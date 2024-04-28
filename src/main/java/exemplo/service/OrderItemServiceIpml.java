package exemplo.service;

import exemplo.model.OrderItem;
import exemplo.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceIpml implements  OrderItemService{


    private final OrderItemRepository orderItemRepository;


    public OrderItemServiceIpml(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItem findById(Long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    @Override
    public OrderItem save(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public void delete(Long id) {
        OrderItem orderItem = findById(id);
        orderItemRepository.delete(orderItem);
    }

    @Override
    public void update(Long id, OrderItem newOderItem) {
        OrderItem orderItem = findById(id);
        orderItem.setPrice(newOderItem.getPrice());
        orderItem.setProduct(newOderItem.getProduct());
        orderItem.setQuantity(newOderItem.getQuantity());
        orderItem.setTotalPrice(newOderItem.getTotalPrice());}

}
