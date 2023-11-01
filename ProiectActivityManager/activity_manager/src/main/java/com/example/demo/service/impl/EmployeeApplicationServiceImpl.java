package com.example.demo.service.impl;

import com.example.demo.model.EmployeeApplication;
import com.example.demo.repository.ApplicationRepository;
import com.example.demo.repository.EmployeeApplicationRepository;
import com.example.demo.service.EmployeeApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeApplicationServiceImpl implements EmployeeApplicationService {

    private final EmployeeApplicationRepository employeeApplicationRepository;

    @Override
    public List<EmployeeApplication> getAllEmployeeApplications() {
        return employeeApplicationRepository.findAll();
    }

    @Override
    public EmployeeApplication createEmployeeApplication(EmployeeApplication employeeApplication) {
        return employeeApplicationRepository.save(employeeApplication);
    }
}
