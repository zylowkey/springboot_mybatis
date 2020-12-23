package com.goldcard.mybatis_demo.service;

import com.goldcard.mybatis_demo.pojo.Customer;

import java.util.List;

public interface CustomerBatchService {
    public int insertCustomer(List<Customer> customerList);
}
