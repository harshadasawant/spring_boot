package com.example.demo.service;

import com.example.demo.bean.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
       Employee emp = (Employee) employeeRepository.save(employee);
       return emp;
    }

    public List<Employee> getAllEmployee(){
        List<Employee> empList =  employeeRepository.findAll();

        if(empList == null || empList.isEmpty()){
            Employee emp = new Employee();
            emp.setAge(34);
            emp.setName("Harshada");
            emp.setStatus(1);
            emp.setEmail("harshda@gmail.com");
            empList = new ArrayList<>();
            emp = employeeRepository.save(emp);
            empList.add(emp);
        }
        return empList;
    }
}
