package com.goldcard.mybatis_demo.service.impl;

import com.goldcard.mybatis_demo.pojo.Customer;

public interface CustomerService {
    Customer getCustomer(Long id);
    int insertCustomer(Customer customer);
}
