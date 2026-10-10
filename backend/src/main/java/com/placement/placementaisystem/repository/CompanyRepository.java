package com.placement.placementaisystem.repository;

import com.placement.placementaisystem.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}