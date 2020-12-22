package com.goldcard.mybatis_demo.controller;

import com.goldcard.mybatis_demo.pojo.Customer;
import com.goldcard.mybatis_demo.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cus")
    public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/getCus")
    @ResponseBody
    public Customer getCustomer(Long id){
        return customerService.getCustomer(id);
    }

    @RequestMapping(value = "/insertCus")
    @ResponseBody
    public Map<String,Object> insertCustomer(String name, String note){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setNote(note);
        int count = customerService.insertCustomer(customer);
        Map<String,Object> result = new HashMap<>();
        result.put("success",count == 1);
        result.put("customer",customer);
        return result;
    }
}
