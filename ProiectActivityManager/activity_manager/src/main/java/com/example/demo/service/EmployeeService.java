package com.example.demo.service;

import com.example.demo.model.Application;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeApplication;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);
}
