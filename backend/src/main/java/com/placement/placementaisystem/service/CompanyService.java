package com.placement.placementaisystem.service;

import com.placement.placementaisystem.entity.Company;
import com.placement.placementaisystem.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getCompanyById(Integer id) {
        return companyRepository.findById(id).orElse(null);
    }
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }
}