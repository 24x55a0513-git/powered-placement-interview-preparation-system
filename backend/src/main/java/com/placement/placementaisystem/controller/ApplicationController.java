package com.placement.placementaisystem.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.placement.placementaisystem.entity.Application;
import com.placement.placementaisystem.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "*")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/{id}")
    public Application getApplicationById(@PathVariable Integer id) {
        return applicationService.getApplicationById(id);
    }

    @PostMapping
    public Application addApplication(@RequestBody Application application) {
        return applicationService.addApplication(application);
    }
}