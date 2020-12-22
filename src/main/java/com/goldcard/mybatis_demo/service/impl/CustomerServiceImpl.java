package com.goldcard.mybatis_demo.service.impl;

import com.goldcard.mybatis_demo.pojo.Customer;
import com.goldcard.mybatis_demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Isolation.READ_COMMITTED 读写提交隔离级别
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
    public Customer getCustomer(Long id) {
        return customerRepository.getCustomer(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
    public int insertCustomer(Customer customer) {
        return customerRepository.insertCustomer(customer);
    }
}
