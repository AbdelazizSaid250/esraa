package com.pioneers.esraa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {
    @GetMapping("student/{name}")
    public String welcomeStudentApi(@PathVariable String name) {
        return "Welcome " + name + " to our Advanced Java and Spring Boot with Docker diploma!!";
    }

    @GetMapping("employee/{name}")
    public String welcomeEmployeeApi(@PathVariable String name) {
        return "Welcome " + name + " to our Tech Pioneers Hub Company!!";
    }

    @GetMapping("instructor/{name}")
    public String welcomeInstructorApi(@PathVariable String name) {
        return "Welcome " + name + " to our Tech Pioneers Hub Company!!";
    }
}
