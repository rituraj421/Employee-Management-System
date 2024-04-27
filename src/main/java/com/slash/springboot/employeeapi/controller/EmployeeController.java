package com.slash.springboot.employeeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
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

    // Method to add employee
    @PostMapping(value = "employees", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addEmployee(@RequestBody Employee employee) {
        empServiceRef.addEmployee(employee);
    }


    @PutMapping(value = "employees/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateEmployee(@RequestBody Employee employee,@PathVariable int empId){
        empServiceRef.updateEmployee(employee, empId);
    }

    // delete mapping
    @DeleteMapping(value = "employees/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteEmployee(@PathVariable int empId) {
        empServiceRef.deleteEmployee(empId);
    }

}
