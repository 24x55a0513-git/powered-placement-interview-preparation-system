package com.placement.placementaisystem.controller;

import com.placement.placementaisystem.dto.JobMatchResult;
import com.placement.placementaisystem.service.MatchingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matching")
public class MatchingController {

    private final MatchingService matchingService;

    public MatchingController(MatchingService matchingService) {
        this.matchingService = matchingService;
    }

    @GetMapping("/{studentId}")
    public List<JobMatchResult> getMatchingJobs(
            @PathVariable Integer studentId) {

        return matchingService.findMatchingJobs(studentId);
    }
}