package com.placement.placementaisystem.controller;

import com.placement.placementaisystem.entity.SkillProgress;
import com.placement.placementaisystem.service.SkillProgressService;
import org.springframework.web.bind.annotation.*;
import com.placement.placementaisystem.dto.ProgressAnalysisResult;
import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class SkillProgressController {

    private final SkillProgressService skillProgressService;

    public SkillProgressController(SkillProgressService skillProgressService) {
        this.skillProgressService = skillProgressService;
    }

    @GetMapping
    public List<SkillProgress> getAllProgress() {
        return skillProgressService.getAllProgress();
    }

    @GetMapping("/{id}")
    public SkillProgress getProgressById(@PathVariable Integer id) {
        return skillProgressService.getProgressById(id);
    }

    @PostMapping
    public SkillProgress addProgress(@RequestBody SkillProgress progress) {
        return skillProgressService.addProgress(progress);
    }
    @GetMapping("/analyze/{studentId}/{skillId}")
    public ProgressAnalysisResult analyzeProgress(
            @PathVariable Integer studentId,
            @PathVariable Integer skillId) {

        return skillProgressService.analyzeProgress(studentId, skillId);
    }
    @GetMapping("/analyze/{studentId}")
    public List<ProgressAnalysisResult> analyzeAllSkills(
            @PathVariable Integer studentId) {

        return skillProgressService.analyzeAllSkills(studentId);
    }
}