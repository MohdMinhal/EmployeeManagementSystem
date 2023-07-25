package com.example.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        
        return employeeRepository.save(employee);
    }

    @Override
    public String removeEmployee(int ID) {
        employeeRepository.deleteById(ID);
        return "Deleted Successfully";
    }

    @Override
    public Employee findEmpByID(int ID) {
        return employeeRepository.findById(ID).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> empList= employeeRepository.findAll();
        return empList;
    }
    
    @Override
    public Employee updateEmployee(Employee employee, int ID) {
        Employee emp = employeeRepository.findById(ID).orElse(null);

        if(emp == null){
            return employeeRepository.save(employee);
        }
        else {
            employeeRepository.delete(emp);
            employeeRepository.save(employee);
        }
        return employee;
    }
}
