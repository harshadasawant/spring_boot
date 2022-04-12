package com.example.demo.controller;

import com.example.demo.bean.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class FirstController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @GetMapping("/get")
    String GetData(){
        return "from get Mapping method";
    }

    @GetMapping("/getcustomer")
    Customer getCustomer(){
     return customerService.getCustomerData();
    }

}
