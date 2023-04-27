package edu.pagination.service;

import edu.pagination.entity.Customer;

import java.util.List;


public class CustomersDto {
    private List<Customer> customers;
    private Integer pageNumber;
    private Integer pageSize;
    private Long totalElements;

    public CustomersDto(List<Customer> customers, Integer pageNumber, Integer pageSize, Long totalElements) {
        this.customers = customers;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalElements = totalElements;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }
}
