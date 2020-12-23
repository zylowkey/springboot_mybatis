package com.goldcard.mybatis_demo.service.impl;

import com.goldcard.mybatis_demo.pojo.Customer;
import com.goldcard.mybatis_demo.service.CustomerBatchService;
import com.goldcard.mybatis_demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CustomerBatchServiceImpl implements CustomerBatchService {
    @Autowired
    private CustomerService customerService;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public int insertCustomer(List<Customer> customerList) {
        int count = 0;
        for (Customer c: customerList) {
            count += customerService.insertCustomer(c);
        }
        return count;
    }
}
