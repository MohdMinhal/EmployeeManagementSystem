package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.serviceIMPL.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private EmployeeRepository repository;

    @Autowired
    private EmployeeServiceImpl empservice;

    @GetMapping("/home")
    public String homePage(){
        return "Welcome to Employee Management";
    }
    @PostMapping("/addEmp")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee emp =empservice.addEmployee(employee);
        return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
    }
    @DeleteMapping("/removeEmp/{ID}")
    public ResponseEntity<String> removeEmployee(@PathVariable int ID){
        empservice.removeEmployee(ID);
        return new ResponseEntity<String>("Remove Successfully",HttpStatus.ACCEPTED);
    }
    @GetMapping("/findEmp/{ID}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable int ID){
        Employee emps = empservice.findEmpByID(ID);
        return new ResponseEntity<Employee>(emps,HttpStatus.ACCEPTED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> listofEmployees(){
        List<Employee> lEmp = empservice.getAllEmployee();
        return new ResponseEntity<List<Employee>>(lEmp, HttpStatus.ACCEPTED);
    }
    @PutMapping("/update/{ID}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable int ID){
        Employee emp = empservice.updateEmployee(employee,ID);
        return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
    }


}
