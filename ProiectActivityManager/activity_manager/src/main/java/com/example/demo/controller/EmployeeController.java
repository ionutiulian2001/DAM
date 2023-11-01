package com.example.demo.controller;

import com.example.demo.model.Application;
import com.example.demo.model.Employee;
import com.example.demo.repository.ApplicationRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping(value="/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}
