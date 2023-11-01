package com.example.demo.service.impl;

import com.example.demo.model.Application;
import com.example.demo.repository.ApplicationRepository;
import com.example.demo.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Override
    public List<Application> getAllApplications(){
        return applicationRepository.findAll();
    }

    @Override
    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }


}
