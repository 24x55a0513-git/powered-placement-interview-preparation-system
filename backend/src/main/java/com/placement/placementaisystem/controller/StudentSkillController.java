package com.placement.placementaisystem.controller;

import com.placement.placementaisystem.entity.StudentSkill;
import com.placement.placementaisystem.service.StudentSkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student-skills")
public class StudentSkillController {

    private final StudentSkillService studentSkillService;

    public StudentSkillController(StudentSkillService studentSkillService) {
        this.studentSkillService = studentSkillService;
    }

    @GetMapping
    public List<StudentSkill> getAllStudentSkills() {
        return studentSkillService.getAllStudentSkills();
    }

    @PostMapping
    public StudentSkill addStudentSkill(@RequestBody StudentSkill studentSkill) {
        return studentSkillService.addStudentSkill(studentSkill);
    }
}