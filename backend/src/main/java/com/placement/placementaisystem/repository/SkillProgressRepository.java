package com.placement.placementaisystem.repository;

import com.placement.placementaisystem.entity.SkillProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillProgressRepository
        extends JpaRepository<SkillProgress, Integer> {
}