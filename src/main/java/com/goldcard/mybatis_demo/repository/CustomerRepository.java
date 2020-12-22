package com.goldcard.mybatis_demo.repository;

import com.goldcard.mybatis_demo.pojo.Customer;

public interface CustomerRepository {
    Customer getCustomer(Long id);
    int insertCustomer(Customer customer);
}
