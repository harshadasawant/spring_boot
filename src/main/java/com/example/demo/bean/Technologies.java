package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
    String techName;

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }
    public void tech(){
        System.out.println(techName+" is Completed");
    }
}
