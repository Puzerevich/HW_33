package com.example.HW_33_spring_data.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @GetMapping
    public String goHomePage() {
        return "Application is worked!";
    }
}
