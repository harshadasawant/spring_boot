package com.example.demo.controller;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    Employee addEmployee(@RequestBody Employee employee){
        return  employeeService.addEmployee(employee);
    }


    @GetMapping("/getAllEmployee")
    List<Employee> getEmployee(){
        return employeeService.getAllEmployee();
    }
}
