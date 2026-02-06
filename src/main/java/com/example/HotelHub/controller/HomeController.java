package com.example.HotelHub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller public class HomeController {
    @GetMapping("/register")
    public String hello(Model model) {
        return "register/register.html";
    }
}
