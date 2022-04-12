package com.example.demo.bean;


import org.springframework.stereotype.Component;

@Component
public class Customer {
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void disaply(){
        System.out.println("From customer class");
    }
}
