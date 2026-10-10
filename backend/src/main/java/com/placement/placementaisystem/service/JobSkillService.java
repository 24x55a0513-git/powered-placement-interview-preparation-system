package com.placement.placementaisystem.service;

import com.placement.placementaisystem.entity.JobSkill;
import com.placement.placementaisystem.entity.JobSkillId;
import com.placement.placementaisystem.repository.JobSkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSkillService {

    private final JobSkillRepository jobSkillRepository;

    public JobSkillService(JobSkillRepository jobSkillRepository) {
        this.jobSkillRepository = jobSkillRepository;
    }

    public List<JobSkill> getAllJobSkills() {
        return jobSkillRepository.findAll();
    }

    public JobSkill getJobSkillById(Integer jobId, Integer skillId) {
        JobSkillId id = new JobSkillId(jobId, skillId);
        return jobSkillRepository.findById(id).orElse(null);
    }

    public JobSkill addJobSkill(JobSkill jobSkill) {
        return jobSkillRepository.save(jobSkill);
    }
}