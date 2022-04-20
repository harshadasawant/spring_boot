package com.example.demo.service;

import com.example.demo.bean.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
       Employee emp = (Employee) employeeRepository.save(employee);
//        System.out.println(10/0);
       Employee emp1 = new Employee();
       emp1.setName("Teju");
       emp1.setAge(25);
       employeeRepository.save(emp1);
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
