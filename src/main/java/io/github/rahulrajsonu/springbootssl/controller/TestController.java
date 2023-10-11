package io.github.rahulrajsonu.springbootssl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getGreeting() {
        return "Spring Boot on HTTPS!";
    }
}
