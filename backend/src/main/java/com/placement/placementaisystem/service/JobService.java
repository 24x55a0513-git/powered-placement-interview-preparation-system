package com.placement.placementaisystem.service;

import com.placement.placementaisystem.entity.Job;
import com.placement.placementaisystem.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    public Job getJobById(Integer id) {
        return jobRepository.findById(id).orElse(null);
    }
}