package com.slash.springboot.employeeapi.dto;

public class Employee {

    private int empId;
    private String empName;
    private String department;

    public Employee(){
        
    }
    // generate constructor , by selecting the variable/fields and then (if using vs code , right click and click source action then click on generate constructor)

    public Employee(int empId, String empName, String department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
