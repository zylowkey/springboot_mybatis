package com.goldcard.mybatis_demo.mapper;

import com.goldcard.mybatis_demo.pojo.Customer;

public interface CustomerMapper {
    Customer getCustomer(Long id);
    int insertCustomer(Customer customer);
}
