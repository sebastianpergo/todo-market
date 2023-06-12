package com.todomarket.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class RunController {
    @GetMapping()
    public String run() {
        return "Hello World!";
    }
}
