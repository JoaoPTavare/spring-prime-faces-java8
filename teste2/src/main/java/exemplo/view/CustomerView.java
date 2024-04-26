package exemplo.view;

import exemplo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import exemplo.service.CustomerService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component

public class CustomerView {
    private final CustomerService customerService;
    private Customer customer;

    private Long searchId;
    private List<Customer> customers;

    @Autowired
    public CustomerView(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostConstruct
    public void init() {
        customer = new Customer();

    }
    public Customer save() {
        return customerService.save(customer);
    }


    public void delete(Long id) {
        customerService.delete(id);
    }

    public List<Customer> findAll() {
        return customerService.findAll();
    }

    public void update(Long id, Customer newCustomer) {
        customerService.update(id, newCustomer);
    }

    public Customer findById(Long id) {
        return customerService.findById(id);
    }


    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }






}
