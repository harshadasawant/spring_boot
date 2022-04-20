package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController {

    @GetMapping("/welcome")
    public ModelAndView showLoginPage(Model model) {
        model.addAttribute("name", "Harshada");

        return new ModelAndView("welcomePage");
    }
}
