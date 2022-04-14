package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Employee {
    @GeneratedValue
    @Id
    int id;
    String name;
    int status;
    int age;
    String email;


}
