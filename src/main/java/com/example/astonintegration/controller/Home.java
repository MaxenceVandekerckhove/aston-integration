package com.example.astonintegration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot Friend!";
    }

}
