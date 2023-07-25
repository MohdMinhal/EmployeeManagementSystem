package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
    
    public Employee addEmployee(Employee employee);

    public String removeEmployee(int ID);

    public Employee findEmpByID(int ID);

    public List<Employee> getAllEmployee();

    public Employee updateEmployee(Employee employee, int ID);


}
