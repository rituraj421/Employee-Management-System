package com.slash.springboot.employeeapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.slash.springboot.employeeapi.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1, "rituraj", "engineering"),
            (new Employee(2, "ritu", "SDE"))));

    @Override
    public List<Employee> getAllEmployee() {
        return empList;
    }

    // methos to get the employee by id
    @Override
    public Employee getEmployeeById(int empId) {
        return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
    }

    // method to add
    @Override
    public void addEmployee(Employee employee) {
        empList.add(employee);
    }

}
