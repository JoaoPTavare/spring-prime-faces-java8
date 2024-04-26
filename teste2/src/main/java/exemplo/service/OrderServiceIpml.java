package exemplo.service;

import exemplo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import exemplo.repository.OrderRepository;

import java.util.List;
@Service
public class OrderServiceIpml implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll(Long id){
        return orderRepository.findAll();
    }
    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
    @Override
    public void update(Long id, Order newOrder) {
        Order order = findById(id);
        order.setItems(newOrder.getItems());
        order.setStatus(newOrder.getStatus());
        order.setTotal(newOrder.getTotal());
        orderRepository.flush();
    }
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
    @Override
    public void  delete(Long id) {
        Order order = findById(id);
        orderRepository.delete(order);
    }
}
