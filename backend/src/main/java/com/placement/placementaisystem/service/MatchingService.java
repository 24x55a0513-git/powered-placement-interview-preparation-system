package com.placement.placementaisystem.service;

import com.placement.placementaisystem.dto.JobMatchResult;
import com.placement.placementaisystem.entity.Job;
import com.placement.placementaisystem.entity.JobSkill;
import com.placement.placementaisystem.entity.Student;
import com.placement.placementaisystem.entity.StudentSkill;
import com.placement.placementaisystem.repository.JobRepository;
import com.placement.placementaisystem.repository.JobSkillRepository;
import com.placement.placementaisystem.repository.StudentRepository;
import com.placement.placementaisystem.repository.StudentSkillRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchingService {

    private final StudentRepository studentRepository;
    private final JobRepository jobRepository;
    private final StudentSkillRepository studentSkillRepository;
    private final JobSkillRepository jobSkillRepository;

    public MatchingService(
            StudentRepository studentRepository,
            JobRepository jobRepository,
            StudentSkillRepository studentSkillRepository,
            JobSkillRepository jobSkillRepository) {

        this.studentRepository = studentRepository;
        this.jobRepository = jobRepository;
        this.studentSkillRepository = studentSkillRepository;
        this.jobSkillRepository = jobSkillRepository;
    }

    public List<JobMatchResult> findMatchingJobs(Integer studentId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        List<StudentSkill> studentSkills =
                studentSkillRepository.findAll();

        List<JobSkill> jobSkills =
                jobSkillRepository.findAll();

        List<Job> allJobs =
                jobRepository.findAll();

        List<JobMatchResult> results = new ArrayList<>();

        for (Job job : allJobs) {

            // Check CGPA
            if (student.getCgpa() < job.getMinimumCgpa()) {
                continue;
            }

            double totalScore = 0;
            int requiredSkills = 0;
            boolean allSkillsMatch = true;

            for (JobSkill jobSkill : jobSkills) {

                if (!jobSkill.getJob().getJobId()
                        .equals(job.getJobId())) {
                    continue;
                }

                requiredSkills++;

                boolean skillFound = false;

                for (StudentSkill studentSkill : studentSkills) {

                    if (studentSkill.getStudent().getStudentId()
                            .equals(studentId)
                            && studentSkill.getSkill().getSkillId()
                            .equals(jobSkill.getSkill().getSkillId())) {

                        int studentLevel = studentSkill.getSkillLevel();
                        int requiredLevel = jobSkill.getMinimumLevel();

                        double skillScore =
                                ((double) studentLevel / requiredLevel) * 100;

                        // Maximum score for one skill is 100%
                        skillScore = Math.min(skillScore, 100);

                        totalScore += skillScore;

                        if (studentLevel < requiredLevel) {
                            allSkillsMatch = false;
                        }

                        skillFound = true;
                        break;
                    }
                }

                if (!skillFound) {
                    allSkillsMatch = false;
                }
            }

            // Add only jobs where all required skills are satisfied
            if (allSkillsMatch && requiredSkills > 0) {

                double matchScore =
                        totalScore / requiredSkills;

                JobMatchResult result = new JobMatchResult(
                        job.getJobId(),
                        job.getJobRole(),
                        job.getCompany().getCompanyName(),
                        matchScore,
                        job.getLocation(),
                        job.getCompany().getPackageLpa()
                );

                results.add(result);
            }
        }

        results.sort((a, b) ->
                Double.compare(b.getMatchScore(), a.getMatchScore())
        );

        return results;
    }
}