package com.example.demo.controller;

import com.example.demo.model.EmployeeApplication;
import com.example.demo.repository.ApplicationRepository;
import com.example.demo.repository.EmployeeApplicationRepository;
import com.example.demo.service.EmployeeApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class EmployeeApplicationController {

    private final EmployeeApplicationService employeeApplicationService;

    @GetMapping(value="/employee/applications")
    public List<EmployeeApplication> getAllApplications(){
        return employeeApplicationService.getAllEmployeeApplications();
    }

    @PostMapping(value="/employee/application")
    public EmployeeApplication createEmployeeApplication(@RequestBody EmployeeApplication employeeApplication){
        return employeeApplicationService.createEmployeeApplication(employeeApplication);
    }
}
