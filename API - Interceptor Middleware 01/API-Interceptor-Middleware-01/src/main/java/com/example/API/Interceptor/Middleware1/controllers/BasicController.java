package com.example.API.Interceptor.Middleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/basic")
public class BasicController {
    @GetMapping("/time")
    public String getCurrentTime(){
        return "This is the current time : " + LocalDateTime.now();
    }
}
