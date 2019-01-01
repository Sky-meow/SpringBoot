package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOne {
    @GetMapping
    public String One(){
        return "this is one";
    }

}
