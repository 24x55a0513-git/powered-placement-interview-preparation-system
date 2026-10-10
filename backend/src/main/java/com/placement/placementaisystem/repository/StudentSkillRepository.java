package com.placement.placementaisystem.repository;

import com.placement.placementaisystem.entity.StudentSkill;
import com.placement.placementaisystem.entity.StudentSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSkillRepository
        extends JpaRepository<StudentSkill, StudentSkillId> {
}