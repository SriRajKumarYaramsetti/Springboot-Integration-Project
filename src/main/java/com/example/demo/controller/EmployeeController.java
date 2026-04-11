package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Sri Raj", "Java Developer"),
                new Employee(2, "John", "React Developer")
        );
    }
}