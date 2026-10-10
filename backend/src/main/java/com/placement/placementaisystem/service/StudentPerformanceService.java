package com.placement.placementaisystem.service;

import com.placement.placementaisystem.entity.StudentSkill;
import com.placement.placementaisystem.repository.StudentSkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentPerformanceService {

    private final StudentSkillRepository studentSkillRepository;

    public StudentPerformanceService(
            StudentSkillRepository studentSkillRepository) {
        this.studentSkillRepository = studentSkillRepository;
    }

    public List<StudentSkill> getStudentSkills(Integer studentId) {

        return studentSkillRepository.findAll()
                .stream()
                .filter(skill ->
                        skill.getStudent()
                                .getStudentId()
                                .equals(studentId))
                .toList();
    }
}