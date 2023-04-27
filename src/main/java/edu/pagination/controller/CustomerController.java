package edu.pagination.controller;

import edu.pagination.service.CustomerService;
import edu.pagination.service.CustomersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/api/v0/customers")
    public CustomersDto fetchCustomersAsList(
            // size: Elementos por pagina
            @RequestParam(defaultValue = "10") Integer size,
            // page: Numero de pagina que desea consultar
            @RequestParam(defaultValue = "0") Integer page
    ) {
        return customerService.fetchCustomerDataAsList(page, size);
    }
}