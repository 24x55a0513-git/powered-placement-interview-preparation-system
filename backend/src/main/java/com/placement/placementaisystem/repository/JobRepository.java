package com.placement.placementaisystem.repository;

import com.placement.placementaisystem.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {
}