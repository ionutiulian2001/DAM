package com.example.demo.controller;

import com.example.demo.model.Application;
import com.example.demo.service.impl.ApplicationServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ApplicationController {

    private ApplicationServiceImpl applicationService;


    @GetMapping(value="/applications")
    public List<Application> getAllApplications(){
        return applicationService.getAllApplications();
    }

    @PostMapping(value="/application")
    public Application createApplication(@RequestBody Application application){
        return applicationService.createApplication(application);
    }
}
