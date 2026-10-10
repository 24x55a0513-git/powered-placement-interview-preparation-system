package com.placement.placementaisystem.repository;

import com.placement.placementaisystem.entity.JobSkill;
import com.placement.placementaisystem.entity.JobSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository
        extends JpaRepository<JobSkill, JobSkillId> {
}