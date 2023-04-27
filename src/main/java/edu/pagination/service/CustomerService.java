package edu.pagination.service;

import edu.pagination.entity.Customer;
import edu.pagination.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomersDto fetchCustomerDataAsList(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Customer> customers = customerRepository.findAll(pageable);
        return mapPage(customers);
    }

    public CustomersDto mapPage(Page<Customer> customerPage) {
        return new CustomersDto(
                customerPage.getContent(),
                customerPage.getNumber(),
                customerPage.getSize(),
                customerPage.getTotalElements()
        );
    }

}
