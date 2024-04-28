package exemplo.service;

import exemplo.model.Customer;
import exemplo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        Customer customer = findById(id);
        customerRepository.delete(customer);
    }

    @Override
    public void update(Long id, Customer newCustomer) {
        Customer customer = findById(id);
        customer.setName(newCustomer.getName());
        customer.setPhone(newCustomer.getPhone());
        customer.setEmail(newCustomer.getEmail());
        customerRepository.flush();

    }


}
