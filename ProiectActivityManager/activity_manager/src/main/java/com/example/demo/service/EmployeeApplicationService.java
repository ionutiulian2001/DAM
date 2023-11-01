package com.example.demo.service;


import com.example.demo.model.Application;
import com.example.demo.model.EmployeeApplication;

import java.util.List;

public interface EmployeeApplicationService {

    List<EmployeeApplication> getAllEmployeeApplications();

    EmployeeApplication createEmployeeApplication(EmployeeApplication employeeApplication);
}
