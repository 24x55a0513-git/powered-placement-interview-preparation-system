package com.placement.placementaisystem.controller;

import com.placement.placementaisystem.entity.JobSkill;
import com.placement.placementaisystem.service.JobSkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-skills")
public class JobSkillController {

    private final JobSkillService jobSkillService;

    public JobSkillController(JobSkillService jobSkillService) {
        this.jobSkillService = jobSkillService;
    }

    @GetMapping
    public List<JobSkill> getAllJobSkills() {
        return jobSkillService.getAllJobSkills();
    }

    @GetMapping("/{jobId}/{skillId}")
    public JobSkill getJobSkillById(
            @PathVariable Integer jobId,
            @PathVariable Integer skillId) {

        return jobSkillService.getJobSkillById(jobId, skillId);
    }

    @PostMapping
    public JobSkill addJobSkill(@RequestBody JobSkill jobSkill) {
        return jobSkillService.addJobSkill(jobSkill);
    }
}