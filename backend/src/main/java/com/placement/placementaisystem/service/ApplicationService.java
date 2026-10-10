package com.placement.placementaisystem.service;

import com.placement.placementaisystem.entity.Application;
import com.placement.placementaisystem.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application getApplicationById(Integer id) {
        return applicationRepository.findById(id).orElse(null);
    }

    public Application addApplication(Application application) {
        return applicationRepository.save(application);
    }
}