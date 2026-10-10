package com.placement.placementaisystem.dto;

import java.util.List;
import java.util.Map;

public class PythonQuestionsResponse {

    private List<Map<String, Object>> ai_interview_questions;

    public PythonQuestionsResponse() {
    }

    public List<Map<String, Object>> getAi_interview_questions() {
        return ai_interview_questions;
    }

    public void setAi_interview_questions(
            List<Map<String, Object>> ai_interview_questions) {

        this.ai_interview_questions = ai_interview_questions;
    }
}