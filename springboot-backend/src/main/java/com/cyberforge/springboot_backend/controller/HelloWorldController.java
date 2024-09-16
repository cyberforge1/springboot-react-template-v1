// File: src/main/java/com/cyberforge/springboot_backend/controller/HelloWorldController.java

package com.cyberforge.springboot_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // GET /helloworld
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello, World!";
    }

    // GET /
    @GetMapping("/")
    public String home() {
        return "Welcome to the Todo API!";
    }
}
