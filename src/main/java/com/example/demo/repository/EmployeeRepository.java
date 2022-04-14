package com.example.demo.repository;

import com.example.demo.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT e FROM Employee e WHERE e.status = 1 order by name")
    List<Employee> findAll();
}
