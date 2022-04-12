package com.example.demo.service;

import com.example.demo.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    Customer customer;

    public Customer getCustomerData(){
        customer.setId(101);
        customer.setName("Harshada");
        return  customer;
    }
}
