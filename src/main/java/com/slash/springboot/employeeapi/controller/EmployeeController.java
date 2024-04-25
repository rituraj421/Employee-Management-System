package com.slash.springboot.employeeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slash.springboot.employeeapi.dto.Employee;
import com.slash.springboot.employeeapi.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empServiceRef;

    @RequestMapping("/welcome")
    public String WelcomeEmployee() {
        return "Hey employee rituraj";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEMployees() {
        return empServiceRef.getAllEmployee();
    }

    // mwthod to get the employee by id
    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable int empId) {
        return empServiceRef.getEmployeeById(empId);
    }
}
