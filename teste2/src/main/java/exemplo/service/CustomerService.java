package exemplo.service;

import exemplo.model.Customer;

import java.util.List;


public interface CustomerService {

    Customer save(Customer customer);

    void delete(Long id);



    List<Customer> findAll();

    void update(Long id, Customer customer);

    Customer findById(Long id);

}
