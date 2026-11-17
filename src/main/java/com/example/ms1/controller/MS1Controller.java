package com.example.ms1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MS1Controller {

    @GetMapping("/MS1")
    public String addNumbers(
            @RequestParam int a,
            @RequestParam int b) {

        int sum = a + b;
        return "MS1=" + sum;
    }
}
