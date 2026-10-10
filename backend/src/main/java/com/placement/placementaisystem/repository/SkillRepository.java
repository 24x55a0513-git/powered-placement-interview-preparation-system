package com.placement.placementaisystem.repository;

import com.placement.placementaisystem.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}