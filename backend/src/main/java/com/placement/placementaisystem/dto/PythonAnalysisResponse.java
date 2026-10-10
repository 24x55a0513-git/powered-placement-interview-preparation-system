package com.placement.placementaisystem.dto;

import java.util.List;

public class PythonAnalysisResponse {

    private Double average_score;
    private List<Object> performance;
    private List<String> weak_skills;
    private List<Object> preparation_plan;
    private String ai_interview_questions;
    public PythonAnalysisResponse() {
    }

    public Double getAverage_score() {
        return average_score;
    }

    public void setAverage_score(Double average_score) {
        this.average_score = average_score;
    }

    public List<Object> getPerformance() {
        return performance;
    }

    public void setPerformance(List<Object> performance) {
        this.performance = performance;
    }

    public List<String> getWeak_skills() {
        return weak_skills;
    }

    public void setWeak_skills(List<String> weak_skills) {
        this.weak_skills = weak_skills;
    }

    public List<Object> getPreparation_plan() {
        return preparation_plan;
    }

    public void setPreparation_plan(List<Object> preparation_plan) {
        this.preparation_plan = preparation_plan;
    }
    public String getAi_interview_questions() {
        return ai_interview_questions;
    }

    public void setAi_interview_questions(String ai_interview_questions) {
        this.ai_interview_questions = ai_interview_questions;
    }
}