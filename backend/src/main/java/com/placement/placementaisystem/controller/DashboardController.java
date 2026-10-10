package com.placement.placementaisystem.controller;

import com.placement.placementaisystem.dto.DashboardResponse;
import com.placement.placementaisystem.service.DashboardService;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/{studentId}")
    public DashboardResponse getDashboard(
            @PathVariable Integer studentId) {

        return dashboardService.getDashboard(studentId);
    }
}