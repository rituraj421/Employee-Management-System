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

    // method to update the employee
    @Override
    public void updateEmployee(Employee employee, int empId) {
        for(int i = 0; i<empList.size(); i++){
            Employee e = empList.get(i);
            if(e.getEmpId() == empId){
                empList.set(i, employee);
                return;
            }
        }
    }

    // method to delete the employee
    @Override
    public void deleteEmployee(int empId) {
        empList.removeIf(e -> e.getEmpId() == empId);
    }

}
