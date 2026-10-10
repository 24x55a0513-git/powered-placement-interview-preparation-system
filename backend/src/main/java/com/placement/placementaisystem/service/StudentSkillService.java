package com.placement.placementaisystem.service;

import com.placement.placementaisystem.entity.StudentSkill;
import com.placement.placementaisystem.repository.StudentSkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSkillService {

    private final StudentSkillRepository studentSkillRepository;

    public StudentSkillService(StudentSkillRepository studentSkillRepository) {
        this.studentSkillRepository = studentSkillRepository;
    }

    public List<StudentSkill> getAllStudentSkills() {
        return studentSkillRepository.findAll();
    }

    public StudentSkill addStudentSkill(StudentSkill studentSkill) {
        return studentSkillRepository.save(studentSkill);
    }
}