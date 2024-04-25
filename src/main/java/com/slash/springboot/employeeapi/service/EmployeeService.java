package com.slash.springboot.employeeapi.service;

import java.util.List;

import com.slash.springboot.employeeapi.dto.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    // interface to get the employee by its id
    Employee getEmployeeById( int empId);
}
