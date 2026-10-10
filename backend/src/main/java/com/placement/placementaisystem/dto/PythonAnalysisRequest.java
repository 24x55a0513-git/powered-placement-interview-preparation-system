package com.placement.placementaisystem.dto;

import java.util.List;

public class PythonAnalysisRequest {

    private List<String> skills;
    private List<Integer> scores;

    public PythonAnalysisRequest() {
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }
}