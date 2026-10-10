package com.placement.placementaisystem.service;

import com.placement.placementaisystem.dto.PythonAnalysisRequest;
import com.placement.placementaisystem.dto.PythonAnalysisResponse;
import com.placement.placementaisystem.entity.StudentSkill;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import com.placement.placementaisystem.dto.PythonQuestionsResponse;
import java.util.HashMap;
import java.util.Map;
@Service
public class PythonAiService {

    private final RestTemplate restTemplate;
    private final StudentPerformanceService studentPerformanceService;

    public PythonAiService(
            RestTemplate restTemplate,
            StudentPerformanceService studentPerformanceService) {

        this.restTemplate = restTemplate;
        this.studentPerformanceService = studentPerformanceService;
    }

    public PythonAnalysisResponse analyzeStudent(Integer studentId) {

        List<StudentSkill> studentSkills =
                studentPerformanceService.getStudentSkills(studentId);

        List<String> skills = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();

        for (StudentSkill studentSkill : studentSkills) {

            skills.add(studentSkill.getSkill().getSkillName());
            scores.add(studentSkill.getSkillLevel());
        }

        PythonAnalysisRequest request =
                new PythonAnalysisRequest();

        request.setSkills(skills);
        request.setScores(scores);

        String url = "http://127.0.0.1:8000/analyze";

        return restTemplate.postForObject(
                url,
                request,
                PythonAnalysisResponse.class
        );
    }
    public PythonQuestionsResponse generateInterviewQuestions(
            List<String> weakSkills) {

        String url = "http://127.0.0.1:8000/generate-questions";

        Map<String, Object> request = new HashMap<>();
        request.put("weak_skills", weakSkills);

        return restTemplate.postForObject(
                url,
                request,
                PythonQuestionsResponse.class
        );
    }
}