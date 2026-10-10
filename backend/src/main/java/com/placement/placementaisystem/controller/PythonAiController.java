package com.placement.placementaisystem.controller;

import com.placement.placementaisystem.dto.PythonAnalysisResponse;
import com.placement.placementaisystem.service.PythonAiService;
import org.springframework.web.bind.annotation.*;
import com.placement.placementaisystem.dto.PythonQuestionsResponse;
import java.util.List;
@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = "*")
public class PythonAiController {

    private final PythonAiService pythonAiService;

    public PythonAiController(PythonAiService pythonAiService) {
        this.pythonAiService = pythonAiService;
    }

    @PostMapping("/analyze/{studentId}")
    public PythonAnalysisResponse analyzeStudent(
            @PathVariable Integer studentId) {

        return pythonAiService.analyzeStudent(studentId);
    }
    @PostMapping("/questions")
    public PythonQuestionsResponse generateQuestions(
            @RequestBody List<String> weakSkills) {

        return pythonAiService.generateInterviewQuestions(weakSkills);
    }
}