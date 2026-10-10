package com.placement.placementaisystem.service;

import com.placement.placementaisystem.entity.SkillProgress;
import com.placement.placementaisystem.repository.SkillProgressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import com.placement.placementaisystem.dto.ProgressAnalysisResult;
import com.placement.placementaisystem.dto.ProgressAnalysisResult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SkillProgressService {

    private final SkillProgressRepository skillProgressRepository;

    public SkillProgressService(SkillProgressRepository skillProgressRepository) {
        this.skillProgressRepository = skillProgressRepository;
    }

    public List<SkillProgress> getAllProgress() {
        return skillProgressRepository.findAll();
    }

    public SkillProgress addProgress(SkillProgress progress) {
        return skillProgressRepository.save(progress);
    }

    public SkillProgress getProgressById(Integer id) {
        return skillProgressRepository.findById(id).orElse(null);
    }
    public ProgressAnalysisResult analyzeProgress(Integer studentId, Integer skillId) {

        List<SkillProgress> progressList = skillProgressRepository.findAll()
                .stream()
                .filter(progress ->
                        progress.getStudent().getStudentId().equals(studentId)
                                && progress.getSkill().getSkillId().equals(skillId))
                .sorted((a, b) ->
                        a.getRecordedDate().compareTo(b.getRecordedDate()))
                .toList();

        if (progressList.size() < 2) {
            return null;
        }

        SkillProgress previous = progressList.get(progressList.size() - 2);
        SkillProgress current = progressList.get(progressList.size() - 1);

        int previousScore = previous.getSkillLevel();
        int currentScore = current.getSkillLevel();

        int improvement = currentScore - previousScore;

        double improvementPercentage =
                ((double) improvement / previousScore) * 100;

        return new ProgressAnalysisResult(
                current.getSkill().getSkillName(),
                previousScore,
                currentScore,
                improvement,
                Math.round(improvementPercentage * 100.0) / 100.0
        );
    }
    public List<ProgressAnalysisResult> analyzeAllSkills(Integer studentId) {

        List<SkillProgress> progressList = skillProgressRepository.findAll()
                .stream()
                .filter(progress ->
                        progress.getStudent().getStudentId().equals(studentId))
                .toList();

        Map<Integer, List<SkillProgress>> skillGroups = new HashMap<>();

        for (SkillProgress progress : progressList) {
            Integer skillId = progress.getSkill().getSkillId();

            skillGroups
                    .computeIfAbsent(skillId, key -> new ArrayList<>())
                    .add(progress);
        }

        List<ProgressAnalysisResult> results = new ArrayList<>();

        for (List<SkillProgress> skillProgressList : skillGroups.values()) {

            skillProgressList.sort(
                    Comparator.comparing(SkillProgress::getRecordedDate)
            );

            if (skillProgressList.size() < 2) {
                continue;
            }

            SkillProgress previous =
                    skillProgressList.get(skillProgressList.size() - 2);

            SkillProgress current =
                    skillProgressList.get(skillProgressList.size() - 1);

            int previousScore = previous.getSkillLevel();
            int currentScore = current.getSkillLevel();

            int improvement = currentScore - previousScore;

            double improvementPercentage =
                    ((double) improvement / previousScore) * 100;

            results.add(
                    new ProgressAnalysisResult(
                            current.getSkill().getSkillName(),
                            previousScore,
                            currentScore,
                            improvement,
                            Math.round(improvementPercentage * 100.0) / 100.0
                    )
            );
        }

        return results;
    }
}